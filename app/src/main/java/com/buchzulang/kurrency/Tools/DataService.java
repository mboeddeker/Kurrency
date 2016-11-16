package com.buchzulang.kurrency.Tools;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.buchzulang.kurrency.Activities.MainActivity;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by MBoeddeker on 16.11.2016.
 */
public class DataService {
    private static DataService ourInstance = new DataService();
    private final String apiPoint = "https://api.fixer.io/latest";

    private MainActivity ma = MainActivity.getMainActivity();
    private CurrencyModel cur = ma.currencyModel;

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {

    }

    public void download(){
        RequestQueue queue = Volley.newRequestQueue(ma.getApplicationContext());
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, apiPoint, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println(response);

                try {
                    JSONObject rates = response.getJSONObject("rates");

                    cur.setDate(response.getString("date"));
                    cur.setAUD(rates.getDouble("AUD"));
                    cur.setBGN(rates.getDouble("BGN"));
                    cur.setBRL(rates.getDouble("BRL"));
                    cur.setCAD(rates.getDouble("CAD"));
                    cur.setCHF(rates.getDouble("CHF"));



                } catch (JSONException e) {
                    System.out.println(e.getLocalizedMessage());
                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println(error.getLocalizedMessage());


            }
        });

        queue.add(jsonObjectRequest);
    }








}

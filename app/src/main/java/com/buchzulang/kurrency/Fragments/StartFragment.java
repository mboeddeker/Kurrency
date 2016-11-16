package com.buchzulang.kurrency.Fragments;


import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.buchzulang.kurrency.Activities.MainActivity;
import com.buchzulang.kurrency.R;
import com.buchzulang.kurrency.Tools.DataService;

public class StartFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private final int REQ_CODE_INTERNET = 46;
    private String mParam1;
    private String mParam2;


    public StartFragment() {

    }

    public static StartFragment newInstance(String param1, String param2) {
        StartFragment fragment = new StartFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_start, container, false);

        Button btn_Start = (Button) v.findViewById(R.id.btn_start);
        btn_Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.getMainActivity().loadOperationScreen();
            }
        });


        downloadCurrencyData();
        
        return v;
    }


    //Background Request to Download all Currency Values.
    private void downloadCurrencyData(){
        if (ActivityCompat.checkSelfPermission( MainActivity.getMainActivity().getApplicationContext(),
                                                Manifest.permission.INTERNET) == PackageManager.PERMISSION_GRANTED){
            DataService.getInstance().download();
        } else {
            ActivityCompat.requestPermissions(MainActivity.getMainActivity(),new  String[] {Manifest.permission.INTERNET}, REQ_CODE_INTERNET);
        }
    }



    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if(requestCode == REQ_CODE_INTERNET && grantResults.length >0 &&grantResults[0] == PackageManager.PERMISSION_GRANTED){
            DataService.getInstance().download();
        }
    }


}

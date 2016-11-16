package com.buchzulang.kurrency.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.buchzulang.kurrency.Activities.MainActivity;
import com.buchzulang.kurrency.R;
import com.buchzulang.kurrency.Tools.CurrencyModel;


public class OperationFragment extends Fragment {

    //  MainActivity
    MainActivity ma = MainActivity.getMainActivity();
    CurrencyModel cur = ma.currencyModel;
    //  +   +   +   +   +   +   +   +   +   +   +   +   +

    //  UI Globals
    private Button  btn_1, btn_2, btn_3, btn_4, btn_5, btn_6,
                    btn_7, btn_8, btn_9, btn_0, btn_point, btn_cancel;

    private ImageButton btn_ChangeCurrency;

    private ImageView img_FlagTop, img_FlagBottom;

    private TextView txt_Top, txt_Bottom, txt_currencySymbol_Top, txt_currencySymbol_Bottom;

    private Spinner spinner_Top, spinner_Bottom;

    private Toolbar toolbar;
    //  +   +   +   +   +   +   +   +   +   +   +   +   +

    //  Class Globals
    private String numberString;


    public OperationFragment() {

    }

    public static OperationFragment newInstance() {
        OperationFragment fragment = new OperationFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_operation, container, false);
        firstUiInit(v);
        return v;
    }



    private void firstUiInit(View v){
        // Buttons Init
        btn_0 = (Button)v.findViewById(R.id.btn_0);
        btn_1 = (Button)v.findViewById(R.id.btn_1);
        btn_2 = (Button)v.findViewById(R.id.btn_2);
        btn_3 = (Button)v.findViewById(R.id.btn_3);
        btn_4 = (Button)v.findViewById(R.id.btn_4);
        btn_5 = (Button)v.findViewById(R.id.btn_5);
        btn_6 = (Button)v.findViewById(R.id.btn_6);
        btn_7 = (Button)v.findViewById(R.id.btn_7);
        btn_8 = (Button)v.findViewById(R.id.btn_8);
        btn_9 = (Button)v.findViewById(R.id.btn_9);
        btn_point = (Button)v.findViewById(R.id.btn_point);
        btn_cancel = (Button)v.findViewById(R.id.btn_Cancel);
        btn_ChangeCurrency = (ImageButton)v.findViewById(R.id.btn_currencyChange);

        //TextViews
        txt_Top = (TextView)v.findViewById(R.id.txt_TopFlag);
        txt_Bottom = (TextView)v.findViewById(R.id.txt_BottomFlag);
        txt_currencySymbol_Top = (TextView)v.findViewById(R.id.currencySymbolTop);
        txt_currencySymbol_Bottom = (TextView)v.findViewById(R.id.currencySymbolBottom);

        // ImageViews
        img_FlagTop = (ImageView)v.findViewById(R.id.img_TopFlag);
        img_FlagBottom = (ImageView)v.findViewById(R.id.img_BottomFlag);

        // Spinner
        spinner_Top = (Spinner)v.findViewById(R.id.spinner_TopFlag);
        spinner_Bottom = (Spinner)v.findViewById(R.id.spinner_BottomFlag);

        // Toolbar
        toolbar = (Toolbar)v.findViewById(R.id.toolbar);



        //UI LISTENER
        setUiListeners();

        numberString = "0";
    }

    private void setUiListeners(){
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_ChangeCurrency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void addText(String sign){
        if (numberString.equals("0")){
            num
        }
    }



}

















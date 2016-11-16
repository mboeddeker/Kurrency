package com.buchzulang.kurrency.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.buchzulang.kurrency.Activities.MainActivity;
import com.buchzulang.kurrency.R;
import com.buchzulang.kurrency.Tools.CurrencyModel;


public class OperationFragment extends Fragment {

    MainActivity ma = MainActivity.getMainActivity();
    CurrencyModel cur = ma.currencyModel;

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


        return v;
    }

}

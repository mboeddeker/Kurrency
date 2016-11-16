package com.buchzulang.kurrency.Activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.buchzulang.kurrency.Fragments.StartFragment;
import com.buchzulang.kurrency.R;
import com.buchzulang.kurrency.Tools.CurrencyModel;

public class MainActivity extends AppCompatActivity {

    //  =   =   =   =   =   =   =   =   =   =   =   =
    public static MainActivity mainActivity;

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    public static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }
    //  =   =   =   =   =   =   =   =   =   =   =   =

    public CurrencyModel currencyModel = new CurrencyModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity.setMainActivity(this);

        FragmentManager fm = getSupportFragmentManager();
        StartFragment startFragment = (StartFragment) fm.findFragmentById(R.id.container_main);
        if (startFragment == null){
            startFragment = StartFragment.newInstance("","");
            fm.beginTransaction().add(R.id.container_main,startFragment).commit();
        }

    }

    public void loadOperationScreen(){
        Toast.makeText(mainActivity, "Hello", Toast.LENGTH_SHORT).show();
        //getSupportFragmentManager().beginTransaction().replace(R.id.container_main,)
    }
}

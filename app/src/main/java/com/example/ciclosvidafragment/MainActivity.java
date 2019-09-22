package com.example.ciclosvidafragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    //Cilco de vida del activity en orden

    //TAG
    private static final String TAG = "TAG ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Fragment con código
        CodeFragment codeFragment = new CodeFragment();
        //Adiminstrador de fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        //Transaccion con frgament
        FragmentTransaction fragmentTransaction =  fragmentManager.beginTransaction();
        //Agregar el fragment
        fragmentTransaction.add(R.id.container,codeFragment);
        //Commit para que se ejecute el cambio
        fragmentTransaction.commit();

        Log.i(TAG,"OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");

    }
}

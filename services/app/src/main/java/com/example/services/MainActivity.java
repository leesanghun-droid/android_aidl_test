package com.example.services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("hdgpio_services","onCreate_app!");
        startService(new Intent(this,MyService.class));
        //finish();
    }
    @Override
    protected void onDestroy()
    {
        Log.d("hdgpio_services","onDestroy_app!");
        super.onDestroy();
    }


}
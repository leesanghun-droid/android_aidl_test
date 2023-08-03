package com.example.client;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private IMyAidlInterface mRemoteService;

    private ServiceConnection mConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.d("hdgpio_client", "onServiceConnected");
            mRemoteService = IMyAidlInterface.Stub.asInterface(service);
        }
        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.d("hdgpio_client", "onServiceDisconnected");
            mRemoteService = null;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent();
        i.setAction("hdgpio_service_test"); // action declared in Server application
        i.setPackage("com.example.services");
        bindService(i, mConnection, BIND_AUTO_CREATE);

        Log.d("hdgpio_client", "bind_start!!");


        Button button2 = (Button) findViewById(R.id.button);
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.d("hdgpio_client", "aidl_ok");
                    Gpio_status gpio_status= new Gpio_status();
                    gpio_status = mRemoteService.gpio_read();

                    Log.d("hdgpio_client", "gpio_status.HEAD : " + gpio_status.HEAD);
                    Log.d("hdgpio_client", "gpio_status.RADAR : " + gpio_status.RADAR);
                    Log.d("hdgpio_client", "gpio_status.EAR_RIGHT : " + gpio_status.EAR_RIGHT);
                    Log.d("hdgpio_client", "gpio_status.EAR_LEFT : " + gpio_status.EAR_LEFT);
                    Log.d("hdgpio_client", "gpio_status.HAND_RIGHT : " + gpio_status.HAND_RIGHT);
                    Log.d("hdgpio_client", "gpio_status.HAND_LEFT : " + gpio_status.HAND_LEFT);
                    Log.d("hdgpio_client", "gpio_status.VIBRATION : " + gpio_status.VIBRATION);

                    Gpio_output gpio_output=new Gpio_output();
                    gpio_output.RED=4;
                    gpio_output.GREEN=3;
                    gpio_output.BLUE=2;
                    gpio_output.AUDIO_EN=1;

                    mRemoteService.set_gpio(gpio_output);

                } catch (RemoteException e) {
                    Log.d("hdgpio_client", "aidl_error");
                    throw new RuntimeException(e);
                }
            }

        });
    }
}
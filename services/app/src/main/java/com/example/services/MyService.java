package com.example.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }

    IMyAidlInterface.Stub mbinder = new IMyAidlInterface.Stub() {
        @Override
        public Gpio_status gpio_read() throws RemoteException {

            Gpio_status gpio_status = new Gpio_status();
            gpio_status.HEAD=1;
            gpio_status.RADAR=2;
            gpio_status.EAR_RIGHT=3;
            gpio_status.EAR_LEFT=4;
            gpio_status.HAND_RIGHT=5;
            gpio_status.HAND_LEFT=6;
            gpio_status.VIBRATION=7;
            Log.d("hdgpio_services","server_gpio_read()");
            return gpio_status;
        }

        @Override
        public void set_gpio(Gpio_output gpio_output) throws RemoteException {

            int red = gpio_output.RED;
            int green = gpio_output.GREEN;
            int blue = gpio_output.BLUE;
            int audio = gpio_output.AUDIO_EN;

            Log.d("hdgpio_services","RED : " + String.valueOf(red));
            Log.d("hdgpio_services","GREEN : " + String.valueOf(green));
            Log.d("hdgpio_services","BLUE : " + String.valueOf(blue));
            Log.d("hdgpio_services","AUDIO : " + String.valueOf(audio));

        }
    };

    @Override
    public IBinder onBind(Intent intent)
    {
        Log.d("hdgpio_services","onBind()!");
        return mbinder;
    }

    @Override
    public void onCreate() {
        Log.d("hdgpio_services","onCreate_MyService!");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Log.d("hdgpio_services","onDestroy_MyService!");
        super.onDestroy();
    }

}
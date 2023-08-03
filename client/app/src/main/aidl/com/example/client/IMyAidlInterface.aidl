
package com.example.client;

import com.example.client.Gpio_status;
import com.example.client.Gpio_output;

interface IMyAidlInterface {
    Gpio_status gpio_read();
    void set_gpio(in Gpio_output gpio_output);
}
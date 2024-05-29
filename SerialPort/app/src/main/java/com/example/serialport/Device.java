package com.example.serialport;

import android.hardware.usb.UsbDevice;

import com.hoho.android.usbserial.driver.UsbSerialDriver;

public class Device {
    UsbDevice device;
    int port;
    UsbSerialDriver driver;

    Device(UsbDevice device, int port, UsbSerialDriver driver) {
        this.device = device;
        this.port = port;
        this.driver = driver;
    }
}

package com.wolfx.designpattern.adapter.objectadapter;


/**
 * @description:
 * @author: sukang
 * @date: 2020-04-01 11:11
 */
public class Client {

    public static void main(String[] args) {
        Voltage220V voltage220V = new Voltage220V();
        Voltage5V voltage5V = new VoltageAdapter(voltage220V);
        Phone phone = new Phone(voltage5V);
        phone.charge();
    }
}

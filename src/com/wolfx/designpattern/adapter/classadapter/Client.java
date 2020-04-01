package com.wolfx.designpattern.adapter.classadapter;

/**
 * @description:
 * @author: sukang
 * @date: 2020-04-01 11:11
 */
public class Client {

    public static void main(String[] args) {
        Voltage5V voltage5V = new VoltageAdapter();
        Phone phone = new Phone(voltage5V);
        phone.charge();
    }
}

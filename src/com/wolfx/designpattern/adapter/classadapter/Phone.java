package com.wolfx.designpattern.adapter.classadapter;

/**
 * @description:
 * @author: sukang
 * @date: 2020-04-01 11:08
 */
public class Phone {

    private Voltage5V voltage5V;

    public Phone(Voltage5V voltage5V) {
        this.voltage5V = voltage5V;
    }

    public void charge(){
        if(voltage5V.output5v() == 5){
            System.out.println("满足充电条件！");
        }else {
            System.out.println("不满足充电条件！");
        }
    }
}

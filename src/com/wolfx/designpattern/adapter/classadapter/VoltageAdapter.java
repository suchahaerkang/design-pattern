package com.wolfx.designpattern.adapter.classadapter;

/**
 * @description:
 * @author: sukang
 * @date: 2020-04-01 11:06
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V{

    /**
     * @description: 将220v的电压适配成5v的电压
     * @param
     * @return: int
     * @author: sukang
     * @date: 2020/4/1 11:07
     */
    @Override
    public int output5v() {
        int i = output220v()/44;
        System.out.println("输出5v电压...");
        return i;
    }
}

package com.wolfx.designpattern.adapter.classadapter;

/**
 * @description: 被适配的类
 * @author: sukang
 * @date: 2020-04-01 10:59
 */
public class Voltage220V {

    /**
     * @description: 输出220v电压
     * @param
     * @return: int
     * @author: sukang
     * @date: 2020/4/1 11:01
     */
    public int output220v(){
        System.out.println("输出220v电压...");
        return 220;
    }
}

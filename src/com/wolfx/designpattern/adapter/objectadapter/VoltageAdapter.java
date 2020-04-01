package com.wolfx.designpattern.adapter.objectadapter;

/**
 * @description:
 * @author: sukang
 * @date: 2020-04-01 11:06
 */
public class VoltageAdapter implements Voltage5V{

    //将Voltage220V聚合到适配器中
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    /**
     * @description: 将220v的电压适配成5v的电压
     * @param
     * @return: int
     * @author: sukang
     * @date: 2020/4/1 11:07
     */
    @Override
    public int output5v() {
        int i = voltage220V.output220v()/44;
        System.out.println("输出5v电压...");
        return i;
    }
}

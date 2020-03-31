package com.wolfx.designpattern.template;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-31 9:58
 */
public class BlackBeanMilk extends MakeMilk{

    /**
     * @description: 重写抽象类的add方法
     * @param
     * @return: void
     * @author: sukang
     * @date: 2020/3/31 9:59
     */
    @Override
    public void add() {
        System.out.println("第二步：给黑豆豆浆加配料...");
    }

    @Override
    boolean isAdd() {
        return false;
    }
}

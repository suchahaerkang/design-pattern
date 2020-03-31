package com.wolfx.designpattern.template;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-31 10:02
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("----制作黑豆豆浆----");
        MakeMilk blackBeanMilk = new BlackBeanMilk();
        blackBeanMilk.make();

        System.out.println("----制作红豆豆浆----");
        MakeMilk redBeanMilk = new RedBeanMilk();
        redBeanMilk.make();
    }
}

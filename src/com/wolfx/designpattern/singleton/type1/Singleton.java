package com.wolfx.designpattern.singleton.type1;

/**
 * @description: 单例模式方式一：饿汉式（静态变量）
 * @author: sukang
 * @date: 2020-04-14 9:01
 */
public class Singleton {

    //静态变量
    private final static Singleton singleton = new Singleton();

    //构造函数私有化
    private Singleton() {
    }

    public static Singleton getInstance(){
        return singleton;
    }
}

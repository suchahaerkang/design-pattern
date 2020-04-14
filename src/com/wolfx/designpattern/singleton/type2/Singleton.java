package com.wolfx.designpattern.singleton.type2;

/**
 * @description: 单例模式方式二：饿汉式（静态代码块）
 * @author: sukang
 * @date: 2020-04-14 9:01
 */
public class Singleton {

    //静态变量
    private static Singleton singleton;

    static {
        singleton = new Singleton();
    }

    //构造函数私有化
    private Singleton() {
    }

    public static Singleton getInstance(){
        return singleton;
    }
}

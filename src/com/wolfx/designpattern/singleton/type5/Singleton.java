package com.wolfx.designpattern.singleton.type5;

/**
 * @description: 单例模式方式五：懒汉式（线程安全，同步代码块）
 * @author: sukang
 * @date: 2020-04-14 9:01
 */
public class Singleton {

    //静态变量
    private static Singleton singleton;

    //构造函数私有化
    private Singleton() {
    }

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized(Singleton.class){
                singleton = new Singleton();
            }
        }

        return singleton;
    }
}

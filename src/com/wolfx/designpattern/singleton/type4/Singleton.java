package com.wolfx.designpattern.singleton.type4;

/**
 * @description: 单例模式方式四：懒汉式（线程安全，同步方法）
 * @author: sukang
 * @date: 2020-04-14 9:01
 */
public class Singleton {

    //静态变量
    private static Singleton singleton;

    //构造函数私有化
    private Singleton() {
    }

    public static synchronized Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }
}

package com.wolfx.designpattern.singleton.type3;

/**
 * @description: 单例模式方式三：懒汉式（线程不安全）
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
            singleton = new Singleton();
        }

        return singleton;
    }
}

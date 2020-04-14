package com.wolfx.designpattern.singleton.type6;

/**
 * @description: 单例模式方式六：懒汉式（双重检查）
 * @author: sukang
 * @date: 2020-04-14 9:01
 */
public class Singleton {

    //静态变量
    private static volatile Singleton singleton;

    //构造函数私有化
    private Singleton() {
    }

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized(Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }
}

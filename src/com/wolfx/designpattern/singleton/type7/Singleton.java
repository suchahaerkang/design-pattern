package com.wolfx.designpattern.singleton.type7;

/**
 * @description: 单例模式方式七：静态内部类
 * @author: sukang
 * @date: 2020-04-14 9:01
 */
public class Singleton {

    private static class SingletonInstance{
        private static Singleton INSTANCE = new Singleton();
    }

    //构造函数私有化
    private Singleton() {
    }

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}

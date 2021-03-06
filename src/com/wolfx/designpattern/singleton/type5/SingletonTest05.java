package com.wolfx.designpattern.singleton.type5;

/**
 * @description:
 * @author: sukang
 * @date: 2020-04-14 9:08
 */
public class SingletonTest05 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

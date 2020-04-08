package com.wolfx.designpattern.build;

/**
 * @description: 建造高楼大厦
 * @author: sukang
 * @date: 2020-04-08 16:39
 */
public class HighHouse extends HouseBuilder{

    @Override
    void buildBasic() {
        System.out.println("高楼大厦打桩...");
    }

    @Override
    void buildWalls() {
        System.out.println("高楼大厦砌墙...");
    }

    @Override
    void roofed() {
        System.out.println("高楼大厦封顶...");
    }
}

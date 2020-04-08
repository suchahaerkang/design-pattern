package com.wolfx.designpattern.build;

/**
 * @description: 建造普通房子
 * @author: sukang
 * @date: 2020-04-08 16:39
 */
public class CommonHouse extends HouseBuilder{

    @Override
    void buildBasic() {
        System.out.println("普通房子打桩...");
    }

    @Override
    void buildWalls() {
        System.out.println("普通房子砌墙...");
    }

    @Override
    void roofed() {
        System.out.println("普通房子封顶...");
    }
}

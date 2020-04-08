package com.wolfx.designpattern.build;

/**
 * @description: 建造其他房子
 * @author: sukang
 * @date: 2020-04-08 16:39
 */
public class OtherHouse extends HouseBuilder{

    @Override
    void buildBasic() {
        System.out.println("建造其他房子打桩...");
    }

    @Override
    void buildWalls() {
        System.out.println("建造其他房子砌墙...");
    }

    @Override
    void roofed() {
        System.out.println("建造其他房子封顶...");
    }
}

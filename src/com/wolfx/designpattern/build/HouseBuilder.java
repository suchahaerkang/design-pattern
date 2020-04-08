package com.wolfx.designpattern.build;

/**
 * @description: 抽象建造者
 * @author: sukang
 * @date: 2020-04-08 16:32
 */
public abstract class HouseBuilder {

    House house = new House();

    abstract void buildBasic();

    abstract void buildWalls();

    abstract void roofed();

    House build(){
        return house;
    }
}

package com.wolfx.designpattern.build;

/**
 * @description:
 * @author: sukang
 * @date: 2020-04-08 16:51
 */
public class Client {

    public static void main(String[] args) {
        //建造普通房子
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector1 = new HouseDirector(commonHouse);
        houseDirector1.constructHouse();

        System.out.println("------------------------------------------------------");

        //建造高楼大厦
        HighHouse highHouse = new HighHouse();
        HouseDirector houseDirector2 = new HouseDirector(highHouse);
        houseDirector2.constructHouse();

        System.out.println("------------------------------------------------------");

        //建造其他房子
        OtherHouse otherHouse = new OtherHouse();
        HouseDirector houseDirector3 = new HouseDirector(otherHouse);
        houseDirector3.constructHouse();

        StringBuilder stringBuilder = new StringBuilder("hello");
        System.out.println(stringBuilder);
    }
}

package com.wolfx.designpattern.proxy.staticproxy;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-09 19:09
 */
public class TeacherDao implements ITeacherDao{

    @Override
    public void teach(String name) {
        System.out.println(name + "老师在讲课...");
    }
}

package com.wolfx.designpattern.proxy.dynamic;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-10 13:08
 */
public class TeacherDao implements ITeacherDao{

    @Override
    public void teach(String name) {
        System.out.println(name + "老师正在授课...");
    }
}

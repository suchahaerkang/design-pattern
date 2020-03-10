package com.wolfx.designpattern.proxy.staticproxy;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-09 19:10
 */
public class TeacherProxy implements ITeacherDao{
    //聚合TeacherDao对象
    private TeacherDao teacherDao;

    //构造函数将TeacherDao对象聚合进来
    public TeacherProxy(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    //代理对象对目标对象的方法增加
    @Override
    public void teach(String name) {
        System.out.println("执行teach()方法之前执行...");
        teacherDao.teach(name);
        System.out.println("执行teach()方法之后执行...");
    }
}

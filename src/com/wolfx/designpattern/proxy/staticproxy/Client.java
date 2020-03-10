package com.wolfx.designpattern.proxy.staticproxy;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-09 19:15
 */
public class Client {

    public static void main(String[] args) {
        //创建一个目标对象
        TeacherDao teacherDao = new TeacherDao();
        //将目标对象聚合到代理对象中
        TeacherProxy teacherProxy = new TeacherProxy(teacherDao);
        //调用代理对象的teach()方法，然后用代理对象去调控目标对象的teach(),达到对teach()方法功能增加的效果
        teacherProxy.teach("张三");
    }
}

package com.wolfx.designpattern.proxy.cglib;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-10 14:50
 */
public class Client {

    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象
        TeacherDao proxy  = (TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        //代理对象调用目标对象的方法
        proxy.teach("李四");
    }
}

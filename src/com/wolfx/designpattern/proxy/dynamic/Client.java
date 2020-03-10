package com.wolfx.designpattern.proxy.dynamic;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-10 13:27
 */
public class Client {

    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        //调用目标对象的teach()方法
        proxyInstance.teach("张三");
    }
}

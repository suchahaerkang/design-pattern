package com.wolfx.designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-10 14:16
 */
public class ProxyFactory implements MethodInterceptor {
    //目标对象
    private Object targert;

    public ProxyFactory(Object targert) {
        this.targert = targert;
    }

    //获取目标对象的代理对象
    public Object getProxyInstance(){
        //创建一个工具类
        Enhancer enhancer = new Enhancer();
        //指定目标对象为父类
        enhancer.setSuperclass(targert.getClass());
        //指定回调函数
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();
    }

    //代理对象调用目标对象的方法的时候，会回调重写的intercept()方法对目标对象的方法增强
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用目标方法之前操作....");
        Object object = method.invoke(targert, objects);
        System.out.println("调用目标方法之后操作....");
        return object;
    }
}

package com.wolfx.designpattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: 代理工厂
 * @author: sukang
 * @date: 2020-03-10 13:10
 */
public class ProxyFactory {

    //目标对象
    private Object target;

    //将目标对象注入到动态代理工厂中
    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * @description: 获取代理对象
     * @param 
     * @return: java.lang.Object
     * @author: sukang
     * @date: 2020/3/10 13:17
     * jdk的Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces, InvocationHandler h)方法创建代理对象
     * 参数的解释：
     * ClassLoader loader：表示当前目标类的类加载器
     * Class<?>[] interfaces： 表示当前目标类的接口类型
     * InvocationHandler h：事件处理器，当通过代理对象去调用目标对象的方法的时候，会触发InvocationHandler事件处理
     * 器，将目标对象的方法的信息通过参数的形式传给事件处理的invoke()方法。invoke()方法在处理目标方法前后可以做一些
     * 操作，比如打印日志。
     *
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),
                new InvocationHandler(){
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("目标方法处理之前处理...");
                        Object obj = method.invoke(target,args);
                        System.out.println("目标方法处理之后处理...");
                        return obj;
                    }
                });
    }
}

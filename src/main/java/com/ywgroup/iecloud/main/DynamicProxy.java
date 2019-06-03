package com.ywgroup.iecloud.main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-03-12 15:20
 **/
public class DynamicProxy implements InvocationHandler {

    private Object subject;

    public DynamicProxy (Object object){
        this.subject = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理对象执行....被代理对象方法执行前");
        method.invoke(subject,args);
        System.out.println("代理对象执行....被代理对象方法执行后");
        return null;
    }

}

package com.ywgroup.iecloud.main.service.impl;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-03-12 16:20
 **/
public class CGLIbProxy implements MethodInterceptor {

    private Object target;

    public Object getInstance(Object target){
        this.target  = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIbProxy running .... 被代理对象方法运行前");
        methodProxy.invokeSuper(object,args);
        System.out.println("CGLIbProxy running ....  被代理对象方法运行后");
        return null;
    }
}

package com.ywgroup.iecloud.main;

import com.ywgroup.iecloud.main.service.Subject;
import com.ywgroup.iecloud.main.service.impl.RealSubject;

import java.lang.reflect.Proxy;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-03-12 15:24
 **/
public class Client {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.testMethod();
        childClass.testPublic();
    }

}

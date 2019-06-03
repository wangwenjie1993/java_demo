package com.ywgroup.iecloud.main.service.impl;

import com.ywgroup.iecloud.main.service.Subject;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-03-12 15:18
 **/
public class RealSubject implements Subject {

    @Override
    public void rent() {
        System.out.println("RealSubject........ rent ");
    }

    @Override
    public void hello(String str) {
        System.out.println("RealSubject ...... hello  " + str);
    }
}

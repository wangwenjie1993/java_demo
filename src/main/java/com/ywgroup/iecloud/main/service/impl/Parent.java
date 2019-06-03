package com.ywgroup.iecloud.main.service.impl;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-03-23 16:03
 **/
public class Parent {

    protected void doSomething(){
        System.out.println("parent runnning .....");
    }

    public static void main(String[] args) {
        Parent parent = new Son();
        parent.doSomething();
    }

}

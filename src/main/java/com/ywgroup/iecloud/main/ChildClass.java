package com.ywgroup.iecloud.main;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-05-16 09:14
 **/
public class ChildClass extends ParentClass {

    static {
        System.out.println("..........child class initing ....." );
    }

    public static int y = 20 ;

    public final static int max = 100;

    public void testMethod(){
        System.out.println("child test method running....");
        super.testPublic();
    }


}

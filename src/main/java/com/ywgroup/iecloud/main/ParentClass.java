package com.ywgroup.iecloud.main;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-05-16 09:13
 **/
public class ParentClass {

    static {
        System.out.println(" ........ parent class initing .....");
    }

    public static int x  = 10 ;

    private void testPrivate(){
        System.out.println("parent private method....");
    }

    public void testPublic(){
        System.out.println("parent public method....");
    }

}

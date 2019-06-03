package com.ywgroup.iecloud.main;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-05-16 09:40
 **/
public class Singleton {

    private static Singleton singleton = new Singleton();

    private static int x = 0;

    private static int y ;

    private Singleton(){
        x ++ ;
        y ++ ;
    }

    public static Singleton  getInstance(){
        return singleton;
    }

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.x);
        System.out.println(instance.y);
    }

}

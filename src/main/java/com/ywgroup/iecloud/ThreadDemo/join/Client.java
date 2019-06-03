package com.ywgroup.iecloud.ThreadDemo.join;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-06-03 09:19
 **/
public class Client {
    public static void main(String[] args) {
        Thread proThread = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new JoinRunnable(proThread, i));
            proThread = thread;
            thread.start();
        }
        System.out.println("main thread running ");
    }
}

package com.ywgroup.iecloud.ThreadDemo.join;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-06-03 09:14
 **/
public class JoinRunnable implements Runnable {

    private Thread thread;

    private int count;

    public JoinRunnable(Thread thread, int count){
        this.thread = thread;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            thread.join();
            System.out.println("thread 编号 : " + count + " running ....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

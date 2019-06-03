package com.ywgroup.iecloud.ThreadDemo.notifywait;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-06-03 08:50
 **/
public class Client {

    private static Boolean flag = false;

    private static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        WaitThread waitThread = new WaitThread(flag, lock);
        NotifyThread notifyThread = new NotifyThread(flag, lock);
        waitThread.start();
        notifyThread.start();
        Thread.sleep(3000);
        waitThread.setFlag(true);
        Thread.sleep(5000);
        notifyThread.setFlag(true);
    }

}

package com.ywgroup.iecloud.ThreadDemo.notifywait;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-06-03 08:41
 **/
public class NotifyThread extends Thread {

    private Boolean flag;

    private Object lock;

    public NotifyThread(Boolean flag, Object lock) {
        this.flag = flag;
        this.lock = lock;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Object getLock() {
        return lock;
    }

    public void setLock(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
            while (true){
                synchronized (lock){
                    if(flag){
                        System.out.println(".................................notify thread notifying..................... ");
                            lock.notify();
                            flag = false;
                    }
                    System.out.println("notify thread running ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

        }
    }
}

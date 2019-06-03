package com.ywgroup.iecloud.designmode.observer;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-22 15:25
 **/
public class User implements Observer {

    private String username;

    public User(String username){
        this.username = username;
    }

    @Override
    public void update(String message) {
        System.out.println(username + "..... 收到消息 ....." + message );
    }
}

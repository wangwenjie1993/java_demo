package com.ywgroup.iecloud.designmode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-22 15:22
 **/
public class WxServer implements Observerable {

    private List<Observer> userList;

    public WxServer(List<Observer> userList) {
        this.userList = userList;
    }


    @Override
    public void registryObserver(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        userList.remove(observer);
    }

    @Override
    public void notifyMessage(String message) {
        for (Observer observer : userList) {
            observer.update(message);
        }
    }
}

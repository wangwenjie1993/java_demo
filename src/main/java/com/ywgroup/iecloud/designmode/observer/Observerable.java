package com.ywgroup.iecloud.designmode.observer;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-22 15:20
 **/
public interface Observerable {

    void registryObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyMessage(String message);

}

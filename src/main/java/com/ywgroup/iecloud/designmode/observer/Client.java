package com.ywgroup.iecloud.designmode.observer;

import java.util.ArrayList;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-22 15:27
 **/
public class Client {

    public static void main(String[] args) {
        ArrayList<Observer> observerArrayList = new ArrayList<Observer>();
        WxServer wxServer = new WxServer(observerArrayList);
        User zhangsan = new User("zhangsan");
        User lisi = new User("lisi");
        User wangwu = new User("wangwu");
        wxServer.registryObserver(zhangsan);
        wxServer.registryObserver(lisi);
        wxServer.registryObserver(wangwu);
        wxServer.notifyMessage("java 是世界上最好的语言");
        wxServer.removeObserver(lisi);
        wxServer.removeObserver(zhangsan);
        wxServer.removeObserver(wangwu);
        wxServer.removeObserver(wangwu);
        wxServer.notifyMessage("mysql 是世界上最好的数据库");
    }

}

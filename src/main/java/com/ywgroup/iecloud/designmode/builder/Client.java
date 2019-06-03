package com.ywgroup.iecloud.designmode.builder;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-22 15:56
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Director director = new Director(concreteBuilder);
        director.constructProduct();
    }
}

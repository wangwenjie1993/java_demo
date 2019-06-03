package com.ywgroup.iecloud.designmode.decorator;


/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-19 16:22
 **/
public class Client {

    public static void main(String[] args) {
        AbstractCompoent compoent = new Compoent();
        AbstractDecorator decorator = new Decorator();
        decorator.setAbstractCompoent(compoent);
        decorator.eat();
    }

}

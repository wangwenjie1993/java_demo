package com.ywgroup.iecloud.designmode.decorator;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-19 16:21
 **/
public class Decorator extends AbstractDecorator {

    @Override
    public void eat() {
        super.eat();
        System.out.println("decorator running ");
    }

}

package com.ywgroup.iecloud.designmode.builder;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-22 15:53
 **/
public class ConcreteBuilder implements Builder {
    @Override
    public void buildCreate() {
        System.out.println("buildCreate running ..... ");
    }

    @Override
    public void buildBuild() {
        System.out.println("buildBuild running ....");
    }

    @Override
    public void buildComplete() {
        System.out.println("buildComplete running ... ");
    }
}

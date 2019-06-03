package com.ywgroup.iecloud.designmode.builder;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-22 15:54
 **/
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    void constructProduct(){
        builder.buildCreate();
        builder.buildBuild();
        builder.buildComplete();
    }

}

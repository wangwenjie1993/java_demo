package com.ywgroup.iecloud.designmode.strategy;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-19 15:39
 **/
public class Client {

    public static void main(String[] args) {
        IStrategy iStrategy = new ConCreteStrategyA();
        StrategyContext strategyContext = new StrategyContext(iStrategy);
        strategyContext.contextMethod();
    }

}

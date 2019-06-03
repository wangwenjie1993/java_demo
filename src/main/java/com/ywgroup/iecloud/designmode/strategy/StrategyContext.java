package com.ywgroup.iecloud.designmode.strategy;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-19 15:38
 **/
public class StrategyContext {

    private IStrategy strategy;

    public StrategyContext(IStrategy strategy){
        this.strategy = strategy;
    }

    public void contextMethod(){
        this.strategy.algorithmMethod();
    }

}

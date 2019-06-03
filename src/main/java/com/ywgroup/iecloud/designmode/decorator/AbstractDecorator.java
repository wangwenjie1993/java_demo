package com.ywgroup.iecloud.designmode.decorator;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-19 16:17
 **/
public abstract class AbstractDecorator implements AbstractCompoent{

    private AbstractCompoent abstractCompoent;

    public void setAbstractCompoent(AbstractCompoent abstractCompoent){
        this.abstractCompoent = abstractCompoent;
    }

    public void eat(){
        abstractCompoent.eat();
    }

}

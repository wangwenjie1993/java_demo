package com.ywgroup.iecloud.designmode.adapter.classAdapter;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-22 14:59
 **/
public class ClassAdapter2 implements ClassB {

    private ClassA classA;

    public ClassAdapter2(ClassA classA){
        this.classA = classA;
    }


    @Override
    public void isClassB() {
        classA.isClassA();
    }
}

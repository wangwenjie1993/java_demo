package com.ywgroup.iecloud.designmode.adapter.classAdapter;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-22 14:53
 **/
public class ClassAdapter extends ClassAImpl implements ClassB {

    @Override
    public void isClassB() {
        isClassA();
    }
}

package com.ywgroup.iecloud.designmode.adapter.classAdapter;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-22 14:54
 **/
public class Client {
    public static void main(String[] args) {
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.isClassB();

        ClassAImpl classA = new ClassAImpl();
        ClassAdapter2 classAdapter2 = new ClassAdapter2(classA);
        classAdapter2.isClassB();
    }
}

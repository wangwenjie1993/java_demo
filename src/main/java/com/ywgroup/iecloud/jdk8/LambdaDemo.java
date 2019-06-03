package com.ywgroup.iecloud.jdk8;

import java.util.ArrayList;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-15 08:53
 **/
public class LambdaDemo {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");
        strings.forEach(e -> System.out.println(e));
    }

}

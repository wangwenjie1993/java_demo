package com.ywgroup.iecloud.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-15 09:41
 **/
public class StreamDemo {

    public static void main(String[] args) {
        demo2();
    }

    public static void demo1(){
        List<Integer> strings = Arrays.asList(1,3,5,6,7,9);
        long count = strings.stream().filter(e -> e > 3).count();
        System.out.println(count);
    }

    public static void printValue(String value){
        System.out.println("printValue running ...." + value);
    }

    public static void demo2(){
        Consumer<String> printValue = StreamDemo::printValue;
        List<String> strings = Arrays.asList("e", "a", "b", "c", "de");
//        strings.forEach(printValue);
        strings.forEach(x -> printValue.accept(x));
    }



}

package com.ywgroup.iecloud.jdk8.sevice;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-15 09:04
 **/
public interface DefaultFunctionService {

    default void defaultFunction(){
        System.out.println("service default function running");
    };


}

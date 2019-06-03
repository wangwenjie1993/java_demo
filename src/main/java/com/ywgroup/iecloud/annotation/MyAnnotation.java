package com.ywgroup.iecloud.annotation;

import java.lang.annotation.*;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-05-13 13:52
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String desc();

}

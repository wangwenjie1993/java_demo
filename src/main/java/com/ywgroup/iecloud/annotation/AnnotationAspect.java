package com.ywgroup.iecloud.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-05-13 14:14
 **/
@Aspect
@Component
public class AnnotationAspect {

    @Pointcut("@annotation(com.ywgroup.iecloud.annotation.MyAnnotation)")
    public void annotationPointCut(){
    }

    @Before("annotationPointCut()")
    public void before(JoinPoint joinPoint){
        MethodSignature sign = (MethodSignature)joinPoint.getSignature();
        Method method = sign.getMethod();
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        System.out.println("............................"+annotation.desc()+"........................");
    }

}

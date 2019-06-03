package com.ywgroup.iecloud.annotation;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-05-13 13:57
 **/
@Component
@RestController
public class AnnotationDemo {

    @MyAnnotation(desc = "my annotation demo")
    @GetMapping(value = "annotationDemo")
    public String test(){
        return "success";
    }

}

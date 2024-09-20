package com.cz.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotationPoinCut {
    @Before("execution(* com.cz.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("before");
    }

    @After("execution(* com.cz.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("after");
    }
}

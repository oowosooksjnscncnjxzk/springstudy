package com.cz.log;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;


public class Afterlog implements AfterReturningAdvice {

    //returnvalue返回值
    //target方法所在的对象
    //method方法对象
    //args方法参数

    @Override
    public void afterReturning(Object returnvalue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"类中的"+method.getName()+"方法执行后返回值："+returnvalue);
    }
}

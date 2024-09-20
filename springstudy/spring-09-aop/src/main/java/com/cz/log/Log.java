package com.cz.log;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    //method:被拦截的方法对象
    //objects:方法调用时所传入的参数
    //o:被拦截的对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "类中的" + method.getName()+"方法开始执行");
    }
}

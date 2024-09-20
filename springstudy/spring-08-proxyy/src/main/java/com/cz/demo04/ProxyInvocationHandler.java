package com.cz.demo04;

import com.cz.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//我们会用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Object target;


    public void setTarget(Object target) {
        this.target = target;
    }

    //生成动态代理类实例
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    
    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用反射机制实现
        startlog(method.getName());
        Object result = method.invoke(target, args);
        endlog(method.getName());
        return result;
    }
    private void startlog(String msg){
        System.out.println("Logging: Method " + msg + " is called.");
    }
    private void endlog(String msg){
        System.out.println("Logging: Method " + msg + " is ended.");
    }
}

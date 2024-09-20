package com.cz.demo03;

import com.cz.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//我们会用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Rent rent;


    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    //Proxy.newProxyInstance()方法的三个参数：
    //参数一:用于指定那个类加载器，去加载生成的代理类
    //参数二：指定接口，这些接口用于指定生成的代理长上面样，也就是有那些方法
    //参数三: InvocationHandler接口的实现类，用于拦截方法调用并进行处理

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),
                this);
    }

    
    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用反射机制实现
        seeHouse();
        Object result = method.invoke(rent, args);
        fare();
        return result;
    }
    private void seeHouse(){
        System.out.println("看房子");
    }

    private void fare(){
        System.out.println("交钱");
    }
}

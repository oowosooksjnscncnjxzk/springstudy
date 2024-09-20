package com.cz.demo04;

import com.cz.demo02.UserService;
import com.cz.demo02.UserServicesImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServicesImpl userServices = new UserServicesImpl();
        //动态代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置代理对象
        pih.setTarget(userServices);
        //动态生成代理角色
        UserService proxy = (UserService) pih.getProxy();//使用的是接口类型
        //动态代理生成的对象： 当你通过 ProxyInvocationHandler 的 getProxy() 方法获取代理对象时，
        // 返回的是类型为 com.sun.proxy.$Proxy0（Java 生成的动态代理类）的对象。
        // 这个代理对象仅实现了你在 pih.setTarget(userServices);
        // 中设置的接口。如果尝试将其强制转换为具体实现类 UserServicesImpl，就会引发 ClassCastException。

        proxy.add();

        //这里我可以对它在进行一次封装，变成一个工具类方便操作

    }
}

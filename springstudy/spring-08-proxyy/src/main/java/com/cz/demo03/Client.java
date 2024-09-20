package com.cz.demo03;

import com.cz.demo03.Rent;



public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理角色  现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象
        //要导入正确的包啊，否则编译不通过
        pih.setRent(host);
        Rent rent = (Rent) pih.getProxy();
        rent.rent();


    }
}

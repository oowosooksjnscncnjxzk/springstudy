package com.cz.demo01;

public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //代理，帮房东租房子，但是呢？代理一般会有些附属操作
        Proxy proxy = new Proxy(host);
        //你不用去找房东，直接找中介租房
        proxy.rent();
    }
}

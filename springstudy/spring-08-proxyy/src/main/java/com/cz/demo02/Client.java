package com.cz.demo02;

public class Client {
    public static void main(String[] args) {
        UserServicesImpl userServices = new UserServicesImpl();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserServices(userServices);

        proxy.add();

    }
}

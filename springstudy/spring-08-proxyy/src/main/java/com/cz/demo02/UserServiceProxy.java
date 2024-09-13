package com.cz.demo02;

public class UserServiceProxy implements UserService {
    UserServicesImpl userServices;

    public void setUserServices(UserServicesImpl userServices) {
        this.userServices = userServices;
    }

    @Override
    public void add() {
        log("add");
        userServices.add();
    }

    @Override
    public void delete() {
        log("delete");
        userServices.delete();

    }

    @Override
    public void update() {
        log("update");
        userServices.update();

    }

    @Override
    public void query() {
        log("query");
        userServices.query();

    }
    //日志方法
    public void log(String msg){
        System.out.println("使用了" + msg+"方法");
    }
    //1.改动原有的业务代码，在公司中是大忌，因为改动了原有代码的功能，可能会导致其他功能出现问题。
}

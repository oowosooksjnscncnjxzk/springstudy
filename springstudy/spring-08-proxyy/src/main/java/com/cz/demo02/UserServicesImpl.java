package com.cz.demo02;

public class UserServicesImpl implements UserService {
    @Override
    public void add() {
        //这样修改十分麻烦
        //System.out.println("使用了add方法");
        System.out.println("增");
    }

    @Override
    public void delete() {
        System.out.println("删");

    }

    @Override
    public void update() {
        System.out.println("改");

    }

    @Override
    public void query() {
        System.out.println("查");

    }
}

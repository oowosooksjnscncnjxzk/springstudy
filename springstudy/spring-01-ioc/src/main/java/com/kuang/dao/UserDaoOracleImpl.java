package com.kuang.dao;

public class UserDaoOracleImpl implements UseDao {
    @Override
    public void getUser() {
        System.out.println("Oracle数据库查询用户信息");
    }
}

package com.kuang.services;

import com.kuang.dao.UseDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService {
    //private UseDao userDao=new UserDaoImpl();
    private UseDao userDao=new UserDaoOracleImpl();
    @Override
    public void getUser() {
        userDao.getUser();
    }
}

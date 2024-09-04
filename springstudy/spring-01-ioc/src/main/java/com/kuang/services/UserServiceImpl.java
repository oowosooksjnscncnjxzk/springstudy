package com.kuang.services;

import com.kuang.dao.UseDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService {
    //private UseDao userDao=new UserDaoImpl();
    private UseDao userDao;

    public void setUserDao(UseDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}

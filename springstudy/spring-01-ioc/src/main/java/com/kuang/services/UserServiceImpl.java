package com.kuang.services;

import com.kuang.dao.UseDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {
    //private UseDao userDao=new UserDaoImpl();
    private UseDao userDao=new UserDaoMysqlImpl();
    @Override
    public void getUser() {
        userDao.getUser();
    }
}

package com.kuang.dao;

public class UserDaoMysqlImpl implements UseDao{
    //当我要调用这个实现类的方法时，就要修改业务层的代码，把UserDaoMysqlImpl改成UserDaoMysqlImpl2，然后再编译运行，这样才能使用新的实现类。
    @Override
    public void getUser() {
        System.out.println("用户使用mysql数据库查询");
    }
}

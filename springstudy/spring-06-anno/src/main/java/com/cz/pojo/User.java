package com.cz.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//等价于<bean id="user" class="com.cz.pojo.User"></bean>
//@Component组件
@Component
@Scope("porperty")
public class User {
    @Value("陈倬")
    //相当于<property name="name" value="陈倬"></property>
    public String name;
}

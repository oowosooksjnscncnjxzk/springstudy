package com.cz.config;

import com.cz.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//这个也会被spring托管，因为他本来就是@component注解的类
public class MyConfig {
    //注册一个bean，就相当与之前我们写的一个bean标签
    //这个方法的名字就是bean的id
    //这个方法的返回值就是bean的实例
    //这方法的返回值类型就相当于bean的class属性
    //这个方法的注解@Bean告诉spring，这个方法是一个bean的定义
    @Bean
    public User getUser() {
        User user = new User();
        user.setName("Tom");
        return user;
    }
}

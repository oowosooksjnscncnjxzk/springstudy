package com.cz.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

public class Person {
    //如果显示定义了@Autowired的required属性为false,说明这个对象可以为null，否则不允许为空
    @Resource

    private Cat cat;

    @Resource

    private Dog dog;

    private String name;

    public Person() {
    }

    public Person(@Nullable String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }



    public Dog getDog() {
        return dog;
    }



    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}



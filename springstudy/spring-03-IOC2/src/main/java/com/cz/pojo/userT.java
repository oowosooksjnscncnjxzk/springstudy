package com.cz.pojo;

public class userT {
    public userT() {
        System.out.println("userT被创建了");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name="+name);
    }
}

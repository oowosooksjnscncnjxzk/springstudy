package com.cz.demo03;

//房东
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东正在出租房子...");
    }
}

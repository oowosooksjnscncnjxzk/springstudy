package com.cz.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }


    @Override
    public void rent() {
       host.rent();
       seeHouse();
        hetong();
        fare();

    }
    //看房
    public void seeHouse(){
        System.out.println("中介带你看房子");

    }

    public void hetong(){
        System.out.println("中介给你签合同");
    }

    public void fare(){
        System.out.println("收中介费");
    }
}

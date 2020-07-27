package com.test.spring51.bean;

/**
 * IOC Bean管理xml方式--通过构造方法注入属性（DI）
 */
public class Order {
    private String name;
    private String address;

    public Order(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void printInfo(){
        System.out.println(name+"::"+address);
    }
}

package com.test.spring51.bean;

/**
 * IOC Bean管理xml方式--通过set方法注入属性（DI）
 */
public class Book {
    private String name;

    private String author;

    private String productor;

    private String address;

    public void setName(String name) {
        this.name = name;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printInfo(){
        System.out.println(name+"::"+author+"::"+productor+"::"+address);
    }
}

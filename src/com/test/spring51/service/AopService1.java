package com.test.spring51.service;

import org.springframework.stereotype.Component;

@Component
public class AopService1 {
    public void printInfo(){
        System.out.println("printInfo........");
    }

    public int add(int a,int b){
        return a+b;
    }
}

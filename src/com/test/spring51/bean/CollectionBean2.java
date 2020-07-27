package com.test.spring51.bean;

import java.util.List;

public class CollectionBean2 {
    private List<String> names;

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void printInfo(){
        System.out.println(names);
    }
}

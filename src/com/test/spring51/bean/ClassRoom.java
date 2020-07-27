package com.test.spring51.bean;

/**
 * 教室类
 */
public class ClassRoom {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "cname='" + cname + '\'' +
                '}';
    }
}

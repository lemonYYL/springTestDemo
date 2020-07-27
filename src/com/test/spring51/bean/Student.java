package com.test.spring51.bean;

/**
 * 学生类
 */
public class Student {
    private String name;
    private String gender;
    private ClassRoom classRoom;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void printInfo(){
        System.out.println(name+"::"+gender+"::"+classRoom);
    }
}

package com.test.spring51.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 工厂Bean测试
 */
public class FactBean implements FactoryBean<Course> {
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setName("i am a course");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}

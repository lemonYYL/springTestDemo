package com.test.spring51.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *  IOC Bean管理xml方式--注入集合属性
 */
public class CollectionBean {
    private Integer[] ids;
    private List<String> names;
    private Map<Integer,Double> maps;
    private Set<String> sets;
    private List<Course> courseList;

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setMaps(Map<Integer, Double> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void printInfo(){
        System.out.println(Arrays.toString(ids));
        System.out.println(names);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courseList);
    }
}

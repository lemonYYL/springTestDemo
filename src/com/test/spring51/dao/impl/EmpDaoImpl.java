package com.test.spring51.dao.impl;

import com.test.spring51.dao.EmpDao;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements EmpDao {
    @Override
    public int add(int a, int b) {
        System.out.println("add方法里。。。。");
        return a+b;
    }

    @Override
    public String update(int id) {
        System.out.println("update方法里。。。。");
        return id+"";
    }
}

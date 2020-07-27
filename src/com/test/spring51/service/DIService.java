package com.test.spring51.service;

import com.test.spring51.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DIService {
    @Autowired
    private EmpDao empDao;

    private int a=10;

    public void printInfo(){
        empDao.update(232);
    }

}

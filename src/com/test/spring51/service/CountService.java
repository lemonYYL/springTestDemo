package com.test.spring51.service;

import com.test.spring51.dao.CountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CountService {

    @Autowired
    private CountDao countDao;

    @Transactional(rollbackFor = Exception.class)
    public void transferMoney(){
        countDao.reduceMoney();
        int i = 100/0;
        countDao.addMoney();
    }
}

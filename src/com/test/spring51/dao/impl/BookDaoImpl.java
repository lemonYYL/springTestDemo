package com.test.spring51.dao.impl;

import com.test.spring51.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void printDaoInfo() {
        System.out.println("bookdao info ......");
    }
}

package com.test.spring51.service;

import com.test.spring51.dao.BookDao;

/**
 * IOC--Bean管理基于xml方式-注入外部bean测试
 */
public class BookService {

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void printInfo(){
        System.out.println("bookService info......");
        bookDao.printDaoInfo();
    }
}

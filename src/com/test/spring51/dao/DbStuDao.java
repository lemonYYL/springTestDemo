package com.test.spring51.dao;

import com.test.spring51.bean.DbStu;

import java.util.List;

public interface DbStuDao {
    void insert(DbStu dbStu);
    void delone(int id);
    void update(DbStu dbStu,int id);
    String queryName(int id);
    DbStu queryStu(int id);
    List<DbStu> queryAllL();
    void updateOneMore(List<Object[]> args);
}

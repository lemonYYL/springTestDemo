package com.test.spring51.service;

import com.test.spring51.bean.DbStu;
import com.test.spring51.dao.DbStuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {
    @Autowired
    private DbStuDao dbStuDao;

    public void insert(DbStu stu){
        dbStuDao.insert(stu);
        System.out.println("insert ok.....");
    }

    public void del(int id){
        dbStuDao.delone(id);
        System.out.println("del ok.....");
    }

    public void update(DbStu dbStu,int id){
        dbStuDao.update(dbStu,id);
        System.out.println("update ok.....");
    }

    public void quert(int id){
        String s = dbStuDao.queryName(id);
        System.out.println(s+"    quert ok.....");
    }

    public void queryOne(int id){
       DbStu stu = dbStuDao.queryStu(id);
       System.out.println(stu);
    }

    public void queryAll(){
        List<DbStu> list = dbStuDao.queryAllL();
        System.out.println(list);
    }

    public void insertOneMore(List<Object[]> list){
        dbStuDao.updateOneMore(list);
    }
}

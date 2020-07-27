package com.test.spring51.testdemo;

import com.test.spring51.bean.DbStu;
import com.test.spring51.service.DbService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

import java.util.ArrayList;
import java.util.List;

public class DbTest {

    @Test
    public void dbTest(){
        ApplicationContext context =new ClassPathXmlApplicationContext("db.xml");
        DbService dbService = context.getBean(DbService.class);

        /*DbStu stu = new DbStu();
        stu.setId(3);
        stu.setAge(45);
        stu.setName("wrt3");
        stu.setGender("female");
        dbService.insert(stu);
        dbService.queryOne(2);
        dbService.queryAll();*/
        List<Object[]> list = new ArrayList<>();
        Object[] objects = {4,34,"3434","male"};
        Object[] objects1 = {5,34,"232","female"};
        list.add(objects);
        list.add(objects1);
        dbService.insertOneMore(list);

    }
}

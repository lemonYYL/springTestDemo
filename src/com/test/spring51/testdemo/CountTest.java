package com.test.spring51.testdemo;

import com.test.spring51.config.ApplicationConfig;
import com.test.spring51.service.CountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountTest {
    @Test
    public void transferMoney(){
        ApplicationContext context = new ClassPathXmlApplicationContext("transaction.xml");
        CountService countService = context.getBean(CountService.class);
        countService.transferMoney();
    }

    @Test
    public void transferMoney1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        CountService countService = context.getBean(CountService.class);
        countService.transferMoney();
    }
}

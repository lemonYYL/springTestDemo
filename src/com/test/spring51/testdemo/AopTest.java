package com.test.spring51.testdemo;

import com.test.spring51.config.ApplicationConfig;
import com.test.spring51.service.AopService1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {

    @Test
    public void aopAnnoTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        AopService1 aopService1 = context.getBean("aopService1",AopService1.class);
        aopService1.printInfo();
    }
}

package com.test.spring51.testdemo;

import com.test.spring51.bean.*;
import com.test.spring51.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class BeanDITest {
    @Test
    public void bookTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        BookService service = context.getBean("bookService",BookService.class);
        service.printInfo();
    }

    @Test
    public void StudentTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        Student student = context.getBean("student",Student.class);
        student.printInfo();
    }

    @Test
    public void CollTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");

        CollectionBean bean = context.getBean("coll",CollectionBean.class);
        bean.printInfo();
    }

    @Test
    public void CollTest2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");

        CollectionBean2 bean = context.getBean("coll2", CollectionBean2.class);
        bean.printInfo();

        Course course = context.getBean("factBean",Course.class);
        System.out.println(course);
    }

    @Test
    public void EmpTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");

        Emp emp = context.getBean("emp",Emp.class);
        System.out.println(emp);
    }

}

package com.test.spring51.testdemo;


import com.test.spring51.bean.Book;
import com.test.spring51.bean.Order;
import com.test.spring51.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void test(){
        //1、加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2、获取配置创建的对象
        User user  = context.getBean("user",User.class);
        System.out.println(user);
        user.printWord();

    }

    /**
     * IOC Bean管理xml方式--通过set方法注入属性（DI）
     */
    @Test
    public void bookTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Book book = context.getBean("book",Book.class);
        book.printInfo();
    }

    /**
     * IOC Bean管理xml方式--通过构造方法注入属性（DI）
     */
    @Test
    public void orderTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Order order = context.getBean("order",Order.class);
        order.printInfo();
    }

    /**
     * Bean的作用域测试
     */
    @Test
    public void scopeTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Book book = context.getBean("book",Book.class);
        Book book1 = context.getBean("book",Book.class);

        System.out.println(book);
        System.out.println(book1);
    }
}

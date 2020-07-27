package com.test.spring51.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopService2 {
    @Before(value = "execution(* com.test.spring51.service.AopService1.printInfo(..))")
    public void before(){
        System.out.println("before......");
    }

    @After(value = "execution(* com.test.spring51.service.AopService1.printInfo(..))")
    public void after(){
        System.out.println("after.......");
    }

    @AfterReturning(value = "execution(* com.test.spring51.service.AopService1.printInfo(..))")
    public void afterReturning(){
        System.out.println("afterReturning.....");
    }

    @AfterThrowing(value = "execution(* com.test.spring51.service.AopService1.printInfo(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing.......");
    }

    @Around(value = "execution(* com.test.spring51.service.AopService1.printInfo(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("arounding before.....");
        joinPoint.proceed();
        System.out.println("arounding after....");
    }

    @After(value = "execution(* com.test.spring51.service.AopService1.add(..))")
    public void paraTest(){
        System.out.println("after add.......");
    }

}

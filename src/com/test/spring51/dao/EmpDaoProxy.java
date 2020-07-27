package com.test.spring51.dao;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class EmpDaoProxy implements InvocationHandler {

    private Object object;

    public EmpDaoProxy(Object o){
        this.object = o;
    }

    /**
     * 增强逻辑
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行之前。。。。"+method.getName()+" :传递的参数"+ Arrays.toString(args));

        //被增强的方法执行
        Object res = method.invoke(object, args);

        System.out.println("方法执行之后。。。。"+object);

        return res;
    }
}

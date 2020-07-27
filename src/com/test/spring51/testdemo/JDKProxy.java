package com.test.spring51.testdemo;

import com.test.spring51.dao.EmpDao;
import com.test.spring51.dao.EmpDaoProxy;
import com.test.spring51.dao.impl.EmpDaoImpl;

import java.lang.reflect.Proxy;

/**
 * 使用Proxy类创建代理对象
 */
public class JDKProxy {
    public static void main(String[] args) {
        //创建接口实现类对象
        Class[] interfaces = {EmpDao.class};
        EmpDaoImpl empDao = new EmpDaoImpl();
        EmpDao dao = (EmpDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces,new EmpDaoProxy(empDao));
        int res = dao.add(1,2);
        System.out.println("result:"+res);

        String res2 = dao.update(90);
        System.out.println(res2);
    }
}

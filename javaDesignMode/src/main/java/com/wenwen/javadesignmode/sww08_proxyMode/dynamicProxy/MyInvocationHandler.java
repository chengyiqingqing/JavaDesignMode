package com.wenwen.javadesignmode.sww08_proxyMode.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/4/18.
 */

public class MyInvocationHandler implements InvocationHandler {

    Subject subject;

    public MyInvocationHandler(Subject subject) {
        this.subject = subject;
    }

    public Subject getProxySubject(){
        return (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),this);
    }

    @Override
    public Subject invoke(Object o, Method method, Object[] args){
        Subject newSubject;
        try {
            raisePrice();
            newSubject= (Subject) method.invoke(subject,args);
            giveVIP();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return newSubject;
    }

    public void raisePrice(){
        System.out.println("提升价格");
    }

    public void giveVIP(){
        System.out.println("送VIP会员");
    }

}

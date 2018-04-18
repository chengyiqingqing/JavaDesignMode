package com.wenwen.javadesignmode.sww08_proxyMode.dynamicProxy;

/**
 * Created by Administrator on 2018/4/18.
 */

public class Main {

    public static void main(String[] args){
        Subject subject=new RealSubject();
        MyInvocationHandler myInvocationHandler=new MyInvocationHandler(subject);
        Subject myProxySubject=myInvocationHandler.getProxySubject();
        myProxySubject.sailBook();
    }

}

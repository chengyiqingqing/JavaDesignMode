package com.wenwen.javadesignmode.sww08_proxyMode.staticProxy;

/**
 * Created by Administrator on 2018/4/18.
 */

public class Main {
    public static void main(String[] args){
        Subject subject=new RealSubject();
        ProxySubject proxySubject=new ProxySubject(subject);
        proxySubject.sailBook();
    }
}

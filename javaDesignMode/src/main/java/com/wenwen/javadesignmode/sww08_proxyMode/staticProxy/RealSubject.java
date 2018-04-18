package com.wenwen.javadesignmode.sww08_proxyMode.staticProxy;

/**
 * Created by Administrator on 2018/4/18.
 */

public class RealSubject implements Subject{

    @Override
    public void sailBook() {
        System.out.println("卖书");
    }

}

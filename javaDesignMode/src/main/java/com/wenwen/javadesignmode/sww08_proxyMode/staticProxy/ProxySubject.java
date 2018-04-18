package com.wenwen.javadesignmode.sww08_proxyMode.staticProxy;

/**
 * Created by Administrator on 2018/4/18.
 */

public class ProxySubject implements Subject{

    Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void sailBook() {
        raisePrice();
        subject.sailBook();
        giveVIP();
    }

    public void raisePrice(){
        System.out.println("提升价格");
    }

    public void giveVIP(){
        System.out.println("送VIP会员");
    }

}

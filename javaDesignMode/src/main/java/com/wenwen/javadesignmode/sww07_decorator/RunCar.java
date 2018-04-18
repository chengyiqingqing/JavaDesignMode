package com.wenwen.javadesignmode.sww07_decorator;

/**
 * Created by Administrator on 2018/4/18.
 */

public class RunCar implements Car{


    @Override
    public void run() {
        System.out.println("可以跑");
    }

    @Override
    public void show() {
        run();
    }
}

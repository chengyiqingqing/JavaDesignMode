package com.wenwen.javadesignmode.sww07_decorator;

/**
 * Created by Administrator on 2018/4/18.
 */

public class FlyCarDecorator extends CarDecorator {

    public FlyCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {

    }

    @Override
    public void show() {
        this.getCar().show();
        fly();
    }

    public void fly(){
        System.out.println("可以飞");
    }
}

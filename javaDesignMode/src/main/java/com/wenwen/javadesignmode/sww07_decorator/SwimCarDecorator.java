package com.wenwen.javadesignmode.sww07_decorator;

/**
 * Created by Administrator on 2018/4/18.
 */

public class SwimCarDecorator extends CarDecorator {

    public SwimCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {

    }

    @Override
    public void show() {
        this.getCar().show();
        swim();
    }

    public void swim(){
        System.out.println("可以游");
    }
}

package com.wenwen.javadesignmode.sww07_decorator;

/**
 * Created by Administrator on 2018/4/18.
 */

public abstract class CarDecorator implements Car{

    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public abstract void show();
}

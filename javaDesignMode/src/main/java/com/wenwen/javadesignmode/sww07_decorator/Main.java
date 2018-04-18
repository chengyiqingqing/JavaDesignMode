package com.wenwen.javadesignmode.sww07_decorator;

/**
 * Created by Administrator on 2018/4/17.
 * 17839221829_163com
 */

public class Main {

    public static void main(String[] args){
        Car runCar=new RunCar();
        Car flyCar=new FlyCarDecorator(runCar);
        Car swimCar=new SwimCarDecorator(flyCar);
        swimCar.show();

    }

}

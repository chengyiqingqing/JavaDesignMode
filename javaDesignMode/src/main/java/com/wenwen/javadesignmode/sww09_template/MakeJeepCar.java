package com.wenwen.javadesignmode.sww09_template;

/**
 * Created by Administrator on 2018/4/18.
 */

public class MakeJeepCar extends MakeCar{

    @Override
    public void makeHead() {
        System.out.println("Jeep车头");
    }

    @Override
    public void makeBody() {
        System.out.println("Jeep车身");

    }

    @Override
    public void makeTail() {
        System.out.println("Jeep车尾");

    }
}

package com.wenwen.javadesignmode.sww02_factoryMethod;

/**
 * Created by Administrator on 2018/4/17.
 */

public class AppleFactory implements FruitFactory {

    @Override
    public Fruit getOneFruit() {
        return  new Apple();
    }
}

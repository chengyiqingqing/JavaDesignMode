package com.wenwen.javadesignmode.sww03_abstractFactory;

/**
 * Created by Administrator on 2018/4/17.
 */

public class NorthFruitFactory implements FruitFactory {

    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanane() {
        return new NorthBanana();
    }

}

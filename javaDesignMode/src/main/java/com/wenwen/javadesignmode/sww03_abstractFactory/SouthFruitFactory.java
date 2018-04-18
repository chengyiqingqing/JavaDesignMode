package com.wenwen.javadesignmode.sww03_abstractFactory;

/**
 * Created by Administrator on 2018/4/17.
 */

public class SouthFruitFactory implements FruitFactory {

    @Override
    public Fruit getApple() {
        return new SouthApple();
    }

    @Override
    public Fruit getBanane() {
        return new SouthBanana();
    }

}

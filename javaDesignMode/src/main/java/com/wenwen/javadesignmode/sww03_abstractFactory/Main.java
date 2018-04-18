package com.wenwen.javadesignmode.sww03_abstractFactory;

/**
 * Created by Administrator on 2018/4/17.
 */

public class Main {

    public static void main(String[] args){
        FruitFactory fruitFactory;
        Fruit fruit;

        fruitFactory=new NorthFruitFactory();
        fruit= fruitFactory.getApple();
        fruit.get();
        fruit=fruitFactory.getBanane();
        fruit.get();

        fruitFactory=new SouthFruitFactory();
        fruit=fruitFactory.getApple();
        fruit.get();
        fruit=fruitFactory.getBanane();
        fruit.get();

    }

}

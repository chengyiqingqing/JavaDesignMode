package com.wenwen.javadesignmode.sww02_factoryMethod;

/**
 * Created by Administrator on 2018/4/17.
 */

public class Main {

    public static void main(String[] args){

        FruitFactory fruitFactory;
        Fruit fruit;

        fruitFactory=new AppleFactory();
        fruit=fruitFactory.getOneFruit();
        fruit.getFruitName();

        fruitFactory=new PeerFactory();
        fruit=fruitFactory.getOneFruit();
        fruit.getFruitName();

    }

}

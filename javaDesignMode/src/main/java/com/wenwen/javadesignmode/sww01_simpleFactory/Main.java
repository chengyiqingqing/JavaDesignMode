package com.wenwen.javadesignmode.sww01_simpleFactory;

/**
 * Created by Administrator on 2018/4/17.
 */

public class Main {

    public static void main(String[] args){
        Fruit fruit1=FruitFactory.get("Apple");
        fruit1.get();
        Fruit fruit2=FruitFactory.get("Banane");
        fruit2.get();
    }

}

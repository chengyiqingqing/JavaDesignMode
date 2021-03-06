package com.wenwen.javadesignmode.sww01_simpleFactory;

/**
 * Created by sww on 2018/4/17.
 * 1.什么是简单工厂模式？
 *      简单工厂模式属于类的创建型模式,又叫做静态工厂方法模式。通过专门定义一个类来负责创建
 *      其他类的实例，被创建的实例通常都具有共同的父类
 * 2.模式中包含的角色及其职责
 *      1.工厂（Creator）角色
 *          简单工厂模式的核心，它负责实现创建所有实例的内部逻辑。工厂类可以被外界直接调用，
 *          创建所需的产品对象
 *      2.抽象产品（Product）角色
 *          简单工厂模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口
 *      3.具体产品（Concrete Product）角色
 *          简单工厂模式所创建的具体实例对象
 * 3.工厂模式
 *      优点：
 *          （1）在这个模式中，工厂类是整个模式的关键所在
 *          （2）它包含必要的判断逻辑，能够根据外界给定的信息（参数），决定究竟应该创建哪个具体类的对象。
 *          （3）用户在使用时可以直接根据工厂类去创建所需的实例，而无需了解这些对象是如何创建
 *              以及如何组织的。有利于整个软件体系结构的优化。
 */

public class FruitFactory {

    public static Fruit get(String type){
        if (type=="Apple"){
            return new Apple();
        }else if (type=="Banane"){
            return new Banane();
        }else {
            return null;
        }
    }

}

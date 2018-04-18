package com.wenwen.javadesignmode.sww05_protoSimpleDeep;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/17.
 */

public class Person implements Cloneable{
    //String类型，在clone过程中和基本类型是一样的路数。
    String name;
    int age;

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    List<String> lists;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person person=(Person) super.clone();
        //如果没有对引用对象进行深克隆，那么person和personClone的引用对象时同一个对象。
        //==================================================
        List<String> list=new ArrayList<>();
        for (String str:this.getLists()){
            list.add(str);
        }
        person.setLists(list);
        //==================================================
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", lists=" + lists +
                '}';
    }
}

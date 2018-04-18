package com.wenwen.javadesignmode.sww09_template;

/**
 * Created by Administrator on 2018/4/18.
 */

public abstract class MakeCar {

    public abstract void makeHead();
    public abstract void makeBody();
    public abstract void makeTail();

    public void make(){
        makeHead();
        makeBody();
        makeTail();
    }

}

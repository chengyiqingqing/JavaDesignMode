package com.wenwen.javadesignmode.sww04_singleInstance;

/**
 * Created by Administrator on 2018/4/17.
 *  饿汉式加载：一开始就加载，不好；
 */

public class Sww01_HangryLoad {

    public final static Sww01_HangryLoad instance=new Sww01_HangryLoad();
    public static Sww01_HangryLoad getInstance(){
        return instance;//拿到该对象；
    }

}

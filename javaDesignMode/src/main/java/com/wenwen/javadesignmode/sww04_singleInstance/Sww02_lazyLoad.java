package com.wenwen.javadesignmode.sww04_singleInstance;

/**
 * Created by Administrator on 2018/4/17.
 * 懒汉式加载：虽然做到了延时加载，但是非线程安全；
 */

public class Sww02_lazyLoad {

    private static Sww02_lazyLoad instance=null;
    private Sww02_lazyLoad(){

    }
    public static Sww02_lazyLoad getInstance(){
        if (instance==null){
            instance=new Sww02_lazyLoad();
        }
        return instance;
    }

}

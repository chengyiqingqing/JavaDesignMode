package com.wenwen.javadesignmode.sww04_singleInstance;

/**
 * Created by Administrator on 2018/4/17.
 */

public class Sww04_recommendStaticInner {

    private Sww04_recommendStaticInner(){

    }

    public static Sww04_recommendStaticInner getInstance(){
        return InnerInstance.instance;
    }


    static class InnerInstance{
        public final static Sww04_recommendStaticInner instance=new Sww04_recommendStaticInner();
    }


}

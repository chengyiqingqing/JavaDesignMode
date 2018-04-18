package com.wenwen.javadesignmode.sww04_singleInstance;

/**
 * Created by Administrator on 2018/4/17.
 */

public class Sww03_doubleCheckSafe {

    private static Sww03_doubleCheckSafe instance=null;
    private Sww03_doubleCheckSafe(){

    }

    public static Sww03_doubleCheckSafe getInstance(){
        if (instance==null){
//            Class clazz=Sww03_doubleCheckSafe.class;锁的是Class对象；
            synchronized (Sww03_doubleCheckSafe.class){
                if (instance==null){
                    instance=new Sww03_doubleCheckSafe();
                }
            }
        }
        return instance;
    }

}

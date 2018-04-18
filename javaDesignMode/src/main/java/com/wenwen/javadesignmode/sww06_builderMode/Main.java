package com.wenwen.javadesignmode.sww06_builderMode;

/**
 * Created by Administrator on 2018/4/17.
 */

public class Main {

    public static void main(String[] args){
        HouseBuilder houseBuilder=new FlatBuilder();
        House house= houseBuilder.setFloor("公寓地板")
                .setWall("公寓墙")
                .setTop("公寓房顶")
                .build();
        System.out.println(house);

    }

}

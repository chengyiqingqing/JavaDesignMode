package com.wenwen.javadesignmode.sww06_builderMode;

/**
 * Created by Administrator on 2018/4/17.
 */

public class FlatBuilder implements HouseBuilder{

    House house=new House();

    @Override
    public HouseBuilder setFloor(String str) {
        house.setFloor(str);
        return this;
    }

    @Override
    public HouseBuilder setWall(String str) {
        house.setWall(str);
        return this;
    }

    @Override
    public HouseBuilder setTop(String str) {
        house.setTop(str);
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}

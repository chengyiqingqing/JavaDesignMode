package com.wenwen.javadesignmode.sww06_builderMode;

/**
 * Created by Administrator on 2018/4/17.
 */

public interface HouseBuilder {

    HouseBuilder setFloor(String str);
    HouseBuilder setWall(String str);
    HouseBuilder setTop(String str);
    House build();

}

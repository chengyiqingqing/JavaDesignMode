package com.wenwen.javadesignmode.sww05_protoSimpleDeep;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/17.
 */

public class Main {
    
    public static void main(String[] args){
        Person person=new Person();
        person.setName(new String("sww"));
        person.setAge(23);
        List<String> list=new ArrayList<>();
        list.add("张三");
        list.add("李四");
        person.setLists(list);

        Person personClone = null;
        try {
            //此时克隆之后，person和personClone完全一样；但是改变互不影响；
            personClone=person.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        list.add("王二");
        person.setLists(list);
        person.setName(new String("chengyiqingqing"));

        System.out.println(person.toString());
        System.out.println(personClone.toString());
    }
}

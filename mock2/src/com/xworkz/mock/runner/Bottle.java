package com.xworkz.mock.runner;

public class Bottle {
    private String name;
    public Bottle(String name){
        System.out.println("running argumented constuctur");
        this.name=name;

    }
     void cap(){
         System.out.println("name :" +name);
     }
}

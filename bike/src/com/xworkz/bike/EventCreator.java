package com.xworkz.bike;

public class EventCreator  {

    public void unChecked(){
        throw new ArrayIndexOutOfBoundsException("just checking ");
    }
    public void checked() throws NoSuchMethodException{
        throw new NoSuchMethodException("just checking event");
    }
}

package com.xworkz.bike;

public class EventRunner {
    public static void main(String[] args) throws NoSuchMethodException{
        EventCreator eventCreator=new EventCreator();
        eventCreator.checked();
        eventCreator.unChecked();
    }
}

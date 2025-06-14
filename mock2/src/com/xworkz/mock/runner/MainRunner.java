package com.xworkz.mock.runner;

import com.xworkz.mock.dto.InfoDTO;

public class MainRunner {
    public static void main(String[] args) {
        int num;
        Bottle bottle=new Bottle("harsha");
        bottle.cap();
        Animal animal=new Dog();
        animal.makeSound();
        Asus asus=new Asus();
        asus.getPrice();
        SaveInfo saveInfo=new SaveInfo();
        InfoDTO infoDTO =new InfoDTO();
        saveInfo.save(infoDTO);


    }
}

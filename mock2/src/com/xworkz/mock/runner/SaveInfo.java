package com.xworkz.mock.runner;

import com.xworkz.mock.dto.InfoDTO;

public class SaveInfo {

    void save(InfoDTO infoDTO){
        infoDTO.setAge(22);
        infoDTO.setName("harsha");
        String name= infoDTO.getName();

        if ( name.equals("harsha")){
            System.out.println("name is Harsha");
        }
        else System.out.println("name is not harshha");


    }
}

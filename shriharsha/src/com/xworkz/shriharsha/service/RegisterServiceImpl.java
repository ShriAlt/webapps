package com.xworkz.shriharsha.service;

import com.xworkz.shriharsha.dto.RegisterDTO;
import com.xworkz.shriharsha.repository.RegisterRepository;
import com.xworkz.shriharsha.repository.RegisterRepositoryImpl;

public class RegisterServiceImpl implements RegisterService{
    @Override
    public String validate(RegisterDTO dto) {
        String result;
        if (dto!=null){
            System.out.println("dto is not null");
            RegisterRepository registerRepository=new RegisterRepositoryImpl();
            registerRepository.save(dto);
        }
        else {return result="failed";}

        return "failed";
    }
}

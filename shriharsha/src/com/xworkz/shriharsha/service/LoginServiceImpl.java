package com.xworkz.shriharsha.service;

import com.xworkz.shriharsha.dto.LoginDTO;
import com.xworkz.shriharsha.repository.LoginRepository;
import com.xworkz.shriharsha.repository.LoginRepositoryImpl;

public class LoginServiceImpl implements LoginService{
    @Override
    public String validate(LoginDTO dto) {
        LoginRepository loginRepository=new LoginRepositoryImpl();
        loginRepository.save(dto);
        return "";
    }
}

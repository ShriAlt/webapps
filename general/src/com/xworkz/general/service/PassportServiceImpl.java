package com.xworkz.general.service;

import com.xworkz.general.dto.PassportDTO;

public class PassportServiceImpl implements PassportService{
    @Override
    public String validate(PassportDTO passportDTO) {
        return "Failed";
    }
}

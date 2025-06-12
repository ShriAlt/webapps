package com.xworkz.general.service;

import com.xworkz.general.dto.PassportDTO;
import com.xworkz.general.repository.PassportRepository;
import com.xworkz.general.repository.PassportRepositoryImpl;

public class PassportServiceImpl implements PassportService{
    @Override
    public String validate(PassportDTO passportDTO) {
        PassportRepository passportRepository = new PassportRepositoryImpl();
        passportRepository.save(passportDTO);
        return "Failed";
    }
}

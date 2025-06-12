package com.xworkz.general.service;

import com.xworkz.general.dto.BirthCertificateDTO;
import com.xworkz.general.repository.BirthCertificateRepository;
import com.xworkz.general.repository.BirthCertificateRepositoryImpl;

public  class BirthCertificateImpl implements BirthCertificateService{

    @Override
    public String birthCertificateValidate(BirthCertificateDTO dto) {
        BirthCertificateRepository birthCertificateRepository=new BirthCertificateRepositoryImpl();
        birthCertificateRepository.save(dto);
        return "failed";
    }
}

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

    @Override
    public BirthCertificateDTO findById(int id) {
        if (id>0){
            BirthCertificateRepository birthCertificateRepository=new BirthCertificateRepositoryImpl();
            BirthCertificateDTO dto=birthCertificateRepository.findById(id);
//            System.out.println("servive dto :"+dto);
            return dto;
        }

        return null;
    }
}

package com.xworkz.general.service;

import com.xworkz.general.dto.MarriageCertificateDTO;
import com.xworkz.general.repository.MarriageCertificateRepositoryImpl;
import com.xworkz.general.repository.MarrigeCertificateRepository;

public class MarrigeCertificateImpl implements MarrigeCertificateService{
    @Override
    public String validate(MarriageCertificateDTO marriageCertificateDTO) {
        MarrigeCertificateRepository marrigeCertificateRepository=new MarriageCertificateRepositoryImpl();
        marrigeCertificateRepository.save(marriageCertificateDTO);
        return "Failed";
    }
}

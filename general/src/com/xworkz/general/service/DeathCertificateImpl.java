package com.xworkz.general.service;

import com.xworkz.general.dto.DeathCertificateDTO;
import com.xworkz.general.repository.DeathCertificateRepository;
import com.xworkz.general.repository.DeathCertificateRepositoryImpl;

public class DeathCertificateImpl implements DeathCertificateService{

    @Override
    public String validate(DeathCertificateDTO deathCertificateDTO) {
        DeathCertificateRepository deathCertificateRepository=new DeathCertificateRepositoryImpl();
        deathCertificateRepository.save(deathCertificateDTO);
        return "Failed";
    }
}

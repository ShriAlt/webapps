package com.xworkz.general.service;

import com.xworkz.general.dto.DeathCertificateDTO;
import com.xworkz.general.dto.DrivingLicenseDTO;
import com.xworkz.general.repository.DrivingLicenseRepository;
import com.xworkz.general.repository.DrivingLicenseRepositoryImpl;

public class DrivingServiceImpl implements DrivingService{
    @Override
    public String validate(DrivingLicenseDTO drivingLicenseDTO) {
        DrivingLicenseRepository drivingLicenseRepository=new DrivingLicenseRepositoryImpl();
        drivingLicenseRepository.save(drivingLicenseDTO);
        return "Failed";
    }
}

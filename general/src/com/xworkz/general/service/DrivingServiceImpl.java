package com.xworkz.general.service;

import com.xworkz.general.dto.DeathCertificateDTO;
import com.xworkz.general.dto.DrivingLicenseDTO;

public class DrivingServiceImpl implements DrivingService{
    @Override
    public String validate(DrivingLicenseDTO drivingLicenseDTO) {
        return "Failed";
    }
}

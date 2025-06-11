package com.xworkz.general.service;

import com.xworkz.general.dto.JobApplicationDTO;

public class JobServiceImpl implements JobService {
    @Override
    public String validate(JobApplicationDTO dto) {
        return "Failed";
    }
}

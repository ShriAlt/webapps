package com.xworkz.general.service;

import com.xworkz.general.dto.JobApplicationDTO;
import com.xworkz.general.repository.JobRepository;
import com.xworkz.general.repository.JobRepositoryImpl;

public class JobServiceImpl implements JobService {
    @Override
    public String validate(JobApplicationDTO dto) {
        JobRepository jobRepository=new JobRepositoryImpl();
        jobRepository.save(dto);
        return "Failed";
    }
}

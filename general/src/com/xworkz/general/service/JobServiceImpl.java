package com.xworkz.general.service;

import com.xworkz.general.dto.JobApplicationDTO;
import com.xworkz.general.repository.JobRepository;
import com.xworkz.general.repository.JobRepositoryImpl;

public class JobServiceImpl implements JobService {
    @Override
    public String validate(JobApplicationDTO dto) {
        JobRepository jobRepository=new JobRepositoryImpl();

        if(dto.getFullName() ==null || dto.getFullName().length()<4 || dto.getFullName().length()>30){

            return "enter the valid name";
        }
        jobRepository.save(dto);
        return "registered successfully";
    }

    @Override
    public JobApplicationDTO searchForId(int id) {
        if (id<=0){
            return null;
        }
        else {
            JobRepository jobRepository=new JobRepositoryImpl();
            JobApplicationDTO jobApplicationDTO=jobRepository.findById(id);
        return jobApplicationDTO;
        }

    }
}

package com.xworkz.general.service;

import com.xworkz.general.dto.JobApplicationDTO;

public interface JobService {
    String validate(JobApplicationDTO applicationDTO);
    default JobApplicationDTO  searchForId(int id){
        return null;
    }
}

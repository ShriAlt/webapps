package com.xworkz.general.service;

import com.xworkz.general.dto.JobApplicationDTO;

import java.util.List;

public interface JobService {
    String validate(JobApplicationDTO applicationDTO);
    default JobApplicationDTO  searchForId(int id){
        return null;
    }
    List<JobApplicationDTO> searchAll();
}

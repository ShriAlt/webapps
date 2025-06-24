package com.xworkz.general.repository;

import com.xworkz.general.dto.JobApplicationDTO;

import java.util.List;

public interface JobRepository {
    void save(JobApplicationDTO dto);
     JobApplicationDTO findById(int id);
    List<JobApplicationDTO> findAll();
}

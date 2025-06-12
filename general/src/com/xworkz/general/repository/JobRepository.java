package com.xworkz.general.repository;

import com.xworkz.general.dto.JobApplicationDTO;

public interface JobRepository {
    void save(JobApplicationDTO dto);
}

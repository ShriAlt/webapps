package com.xworkz.shriharsha.repository;

import com.xworkz.shriharsha.dto.RegisterDTO;

public interface RegisterRepository {
    void save(RegisterDTO dto);
}

package com.xworkz.bank.repository;

import com.xworkz.bank.dto.LoanDTO;

public interface LoanRepository {
    void save(LoanDTO dto);
}

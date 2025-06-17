package com.xworkz.bank.service;

import com.xworkz.bank.dto.LoanDTO;
import com.xworkz.bank.repository.LoanRepository;
import com.xworkz.bank.repository.LoanRepositoryImpl;

public class LoanServiceImpl implements LoanService{
    @Override
    public void validate(LoanDTO dto) {
        if (dto!=null){
            System.out.println(dto);
            LoanRepository loanRepository=new LoanRepositoryImpl();
            loanRepository.save(dto);
        }
        else System.out.println("dto is null");
    }
}

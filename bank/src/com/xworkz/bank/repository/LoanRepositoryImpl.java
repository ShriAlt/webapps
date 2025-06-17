package com.xworkz.bank.repository;

import com.xworkz.bank.dto.LoanDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LoanRepositoryImpl implements LoanRepository{
    @Override
    public void save(LoanDTO dto) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/generaldb";
            String userName="root";
            String  password="@Mythsri.com10";
            Connection connection=DriverManager.getConnection(url,userName,password);
            Statement statement=connection.createStatement();
            String sql="insert into loan_applications values(0,'"+dto.getFullName()+"','"+dto.getEmail()+"','"+dto.getPhone()+"','"+dto.getLoanType()+"','"+dto.getOccupation()+"','"+dto.getCity()+"','"+dto.getLoanAmount()+"','"+dto.isTermsAccepted()+"') ";
            statement.execute(sql);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

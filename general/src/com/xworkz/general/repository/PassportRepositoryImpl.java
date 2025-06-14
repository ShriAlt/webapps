package com.xworkz.general.repository;

import com.xworkz.general.dto.PassportDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PassportRepositoryImpl implements PassportRepository {
    @Override
    public void save(PassportDTO dto) {
        System.out.println("dry running ");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/generaldb";
            String username="root";
            String  password="@Mythsri.com10";
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            String sql="insert into passport_details values(0,'"+dto.getApplicantName()+"','"+dto.getAadhaarNo()+"','"+dto.getAddress()+"','"+dto.getPanNo()+"','"+dto.getCountry()+"','"+dto.getState()+"','"+dto.getCity()+"','"+dto.getPinCode()+"','"+dto.getPassportType()+"','"+dto.getPaymentRef()+"') ";
            statement.execute(sql);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

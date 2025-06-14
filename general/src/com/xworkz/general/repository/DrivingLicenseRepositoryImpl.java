package com.xworkz.general.repository;

import com.xworkz.general.dto.DrivingLicenseDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DrivingLicenseRepositoryImpl implements DrivingLicenseRepository{
    @Override
    public void save(DrivingLicenseDTO dto) {
        System.out.println("dry running ");
        try {
            //load and register
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/generaldb";
            String username="root";
            String  password="@Mythsri.com10";
            //create connection
            Connection connection = DriverManager.getConnection(url,username,password);
            //prepare statement
            String sql="insert into driver_license_details values(0,'"+dto.getFullName()+"',"+dto.getMobile()+",'"+dto.getAppliedDate()+"','"+dto.getVehicleType()+"')";
            Statement statement=connection.createStatement();

            //execute the statement
            statement.execute(sql);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

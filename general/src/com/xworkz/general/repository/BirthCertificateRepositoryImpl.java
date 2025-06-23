package com.xworkz.general.repository;

import com.xworkz.general.constants.DbConstants;
import com.xworkz.general.dto.BirthCertificateDTO;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class BirthCertificateRepositoryImpl implements BirthCertificateRepository{
    @Override
    public void save(BirthCertificateDTO dto) {
        System.out.println("saved to data base");

        try {
            Class.forName(DbConstants.DRIVER.getProp());
//            String url="jdbc:mysql://localhost:3306/generaldb";
//            String username="root";
//            String  password="@Mythsri.com10";
            Connection connection =DriverManager.getConnection(DbConstants.URL.getProp(),DbConstants.USERNAME.getProp(), DbConstants.PASSWORD.getProp());

            Statement statement=connection.createStatement();
            String sql="insert into birthcertificatedb values(0,'"+dto.getBirthId()+"','"+dto.getHospitalName()+"','"+dto.getFatherName()+"','"+dto.getMotherName()+"','"+dto.getDateOfBirth()+"','"+dto.getTimeOfBirth()+"','"+dto.getDoctorName()+"','"+dto.getNurseName()+"','"+dto.getHospitalType()+"') ";

            statement.execute(sql);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public BirthCertificateDTO findById(int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/generaldb";
            String username="root";
            String  password="@Mythsri.com10";
            Connection connection =DriverManager.getConnection(url,username,password);
            String sql="select * from birthcertificatedb where id=?";
            PreparedStatement preparedStatement =connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet resultSet=preparedStatement.executeQuery();

            while (resultSet.next()){
                int pk =resultSet.getInt(1);
                String birthId=resultSet.getString(2);
                String hospitalName=resultSet.getString(3);
                String fatherName=resultSet.getString(4);
                String motherName=resultSet.getString(5);
                LocalDate dateOfBirth= resultSet.getDate(6).toLocalDate();
                LocalTime timeOfBirth=resultSet.getTime(7).toLocalTime();
                String doctorName=resultSet.getString(8);
                String nurseName=resultSet.getString(9);
                String hospitalType=resultSet.getString(10);
                BirthCertificateDTO dto=new BirthCertificateDTO(birthId,hospitalName,fatherName,motherName,dateOfBirth,timeOfBirth,doctorName,nurseName,hospitalType);
                dto.setId(pk);
                System.out.println("dto :"+dto);
                return dto;
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return null;
    }
}

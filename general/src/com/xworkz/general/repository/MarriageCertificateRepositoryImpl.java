package com.xworkz.general.repository;

import com.xworkz.general.dto.MarriageCertificateDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MarriageCertificateRepositoryImpl implements MarrigeCertificateRepository{
    @Override
    public void save(MarriageCertificateDTO dto) {
        System.out.println("dry running ");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/generaldb";
            String username="root";
            String  password="@Mythsri.com10";
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            String sql="insert into marriage_details values(0,'"+dto.getGroomName()+"','"+dto.getBrideName()+"','"+dto.getLocation()+"','"+dto.getAddress()+"','"+dto.getReligion()+"','"+dto.getMarriageDate()+"','"+dto.getWitness1()+"','"+dto.getWitness2()+"','"+dto.getOfficerPresent()+"') ";

            statement.execute(sql);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

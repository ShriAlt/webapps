package com.xworkz.shriharsha.repository;

import com.xworkz.shriharsha.dto.RegisterDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterRepositoryImpl implements RegisterRepository{
    @Override
    public void save(RegisterDTO dto) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/generaldb";
            String userName="root";
            String  password="@Mythsri.com10";

            Connection connection= DriverManager.getConnection(url,userName,password);
            Statement statement=connection.createStatement();
            String sql="insert into register_details value(0,'"+dto.getName()+"','"+dto.getFatherName()+"','"+dto.getMotherName()+"','"+dto.getEmail()+"','"+dto.getPhoneNumber()+"') ";
            statement.execute(sql);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

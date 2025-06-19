package com.xworkz.shriharsha.repository;

import com.xworkz.shriharsha.dto.LoginDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginRepositoryImpl implements LoginRepository{
    @Override
    public void save(LoginDTO dto) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/generaldb";
            String userName="root";
            String  password="@Mythsri.com10";

            Connection connection= DriverManager.getConnection(url,userName,password);
            Statement statement=connection.createStatement();
            String sql="insert into login_details value(0,'"+dto.getUserName()+"','"+dto.getPassword()+"') ";
            statement.execute(sql);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

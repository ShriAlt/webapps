package com.xworkz.general.repository;

import com.xworkz.general.dto.JobApplicationDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JobRepositoryImpl implements JobRepository{
    @Override
    public void save(JobApplicationDTO dto) {
        System.out.println("dry running ");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/generaldb";
            String username="root";
            String  password="@Mythsri.com10";
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            String sql="insert into job_details values(0,'"+dto.getEmail()+"','"+dto.getEducation()+"','"+dto.getSkills()+"','"+dto.getExpectedSalary()+"','"+dto.getExperience()+"') ";

            statement.execute(sql);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

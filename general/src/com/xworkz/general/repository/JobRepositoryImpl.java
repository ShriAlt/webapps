package com.xworkz.general.repository;

import com.xworkz.general.dto.JobApplicationDTO;

import java.sql.*;

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

    @Override
    public JobApplicationDTO findById(int id) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/generaldb";
            String username="root";
            String  password="@Mythsri.com10";
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from job_details where id="+id+" ");
            System.out.println("resultset "+resultSet);

            while (resultSet.next()) {
                int pk=resultSet.getInt("id");
                String email=resultSet.getString("email");
                String education=resultSet.getString("education");
                String skills=resultSet.getString("skills");
                int expectedSalary=resultSet.getInt("expectedSalary");
                String experience=resultSet.getString("experience");

                JobApplicationDTO jobApplicationDTO=new JobApplicationDTO();
                jobApplicationDTO.setId(id);
                jobApplicationDTO.setEmail(email);
                jobApplicationDTO.setEducation(education);
                jobApplicationDTO.setSkills(skills);
                jobApplicationDTO.setExpectedSalary(expectedSalary);
                jobApplicationDTO.setExperience(experience);
                return jobApplicationDTO;

            }

        }
        catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    }


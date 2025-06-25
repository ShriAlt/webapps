package com.xworkz.general.repository;

import com.xworkz.general.constants.DbConstants;
import com.xworkz.general.dto.JobApplicationDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
//            Statement statement=connection.createStatement();
//            String sql="insert into job_details values(0,'"+dto.getEmail()+"','"+dto.getEducation()+"','"+dto.getSkills()+"','"+dto.getExpectedSalary()+"','"+dto.getExperience()+"') ";
//
//            statement.execute(sql);
            String sql="insert into job_details values(?,?,?,?,?,?) ";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,0);
            preparedStatement.setString(2,dto.getEmail());
            preparedStatement.setString(3,dto.getEducation());
            preparedStatement.setString(4,dto.getSkills());
            preparedStatement.setInt(5,dto.getExpectedSalary());
            preparedStatement.setString(6,dto.getExperience());
            preparedStatement.executeUpdate();
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
//            Statement statement=connection.createStatement();
//            ResultSet resultSet=statement.executeQuery("select * from job_details where id="+id+" ");
//            String sql="select * from job_details where id= ?" ;
//            PreparedStatement preparedStatement=connection.prepareStatement(sql);
//            preparedStatement.setInt(1,id);
//            ResultSet resultSet=preparedStatement.executeQuery();
//            System.out.println("resultset "+resultSet);
            String procedureCall = "{ call GetJobApplicationById(?) }";
            CallableStatement callableStatement = connection.prepareCall(procedureCall);
            callableStatement.setInt(1, id);
            ResultSet resultSet = callableStatement.executeQuery();

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

    @Override
    public List<JobApplicationDTO> findAll() {
        try {
            List<JobApplicationDTO> jobList = new ArrayList<>();
            Class.forName(DbConstants.DRIVER.getProp());
            Connection connection = DriverManager.getConnection(DbConstants.URL.getProp(),DbConstants.USERNAME.getProp(), DbConstants.PASSWORD.getProp());
            String sql="select * from job_details" ;
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
           ResultSet resultSet= preparedStatement.executeQuery();
           while (resultSet.next()){
               int id=resultSet.getInt(1);
             String email=  resultSet.getString(2);
               String education=  resultSet.getString(3);
               String skills=  resultSet.getString(4);
               int expectedSalary=  resultSet.getInt(5);
               String experience=  resultSet.getString(6);
               JobApplicationDTO jobApplicationDTO=new JobApplicationDTO();

               jobApplicationDTO.setId(id);
               jobApplicationDTO.setEmail(email);
               jobApplicationDTO.setEducation(education);




               jobApplicationDTO.setSkills(skills);
               jobApplicationDTO.setExpectedSalary(expectedSalary);
               jobApplicationDTO.setExperience(experience);
//               System.out.println(jobApplicationDTO);
                jobList.add(jobApplicationDTO);
           }
return jobList;
        }
        catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}


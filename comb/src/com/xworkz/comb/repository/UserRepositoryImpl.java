package com.xworkz.comb.repository;

import com.xworkz.comb.constants.DbConstant;
import com.xworkz.comb.dto.UserDTO;

import java.sql.*;

public class UserRepositoryImpl implements UserRepository{
    @Override
    public void save(UserDTO dto) {
        try {
            Class.forName(DbConstant.DRIVER.getProp());
            Timestamp createdAt = new Timestamp(System.currentTimeMillis());
            Connection connection= DriverManager.getConnection(DbConstant.RL.getProp(),DbConstant.USERNAME.getProp(), DbConstant.PASSWORD.getProp());
            String sql="insert into user_info values(?,?,?,?,?) ";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,0);
            preparedStatement.setString(2,dto.getUserId());
            preparedStatement.setString(3,dto.getEmail());
            preparedStatement.setString(4,dto.getPassword());
            preparedStatement.setTimestamp(5,createdAt);
            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public boolean existByUserId(String userId) {
        try {
            Class.forName(DbConstant.DRIVER.getProp());
            Connection connection= DriverManager.getConnection(DbConstant.RL.getProp(),DbConstant.USERNAME.getProp(), DbConstant.PASSWORD.getProp());

            String sql="select user_Id from user_info where user_Id= ? ";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,userId);
            ResultSet resultSet=preparedStatement.executeQuery();
            if (resultSet.next()){
                return true;
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public boolean existByMail(String email) {
        try {
            Class.forName(DbConstant.DRIVER.getProp());
            Connection connection= DriverManager.getConnection(DbConstant.RL.getProp(),DbConstant.USERNAME.getProp(), DbConstant.PASSWORD.getProp());
            String sql="select email from user_info where email= ? ";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,email);
            ResultSet resultSet=preparedStatement.executeQuery();
            if (resultSet.next()){
                return true;
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public String checkByUserId(String userId) {
        try {
            Class.forName(DbConstant.DRIVER.getProp());
            Connection connection= DriverManager.getConnection(DbConstant.RL.getProp(),DbConstant.USERNAME.getProp(), DbConstant.PASSWORD.getProp());

            String sql="select user_Id from user_info where user_Id= ? ";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,userId);
            ResultSet resultSet=preparedStatement.executeQuery();
            if (resultSet.next()){
                return resultSet.getString(1);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public String checkByPassword(String password) {
        try {
            Class.forName(DbConstant.DRIVER.getProp());
            Connection connection= DriverManager.getConnection(DbConstant.RL.getProp(),DbConstant.USERNAME.getProp(), DbConstant.PASSWORD.getProp());

            String sql="select password from user_info where password= ? ";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,password);
            ResultSet resultSet=preparedStatement.executeQuery();
            if (resultSet.next()){
                return resultSet.getString(1);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public String checkForEmail(String userId) {
        try {
            Class.forName(DbConstant.DRIVER.getProp());
            Connection connection= DriverManager.getConnection(DbConstant.RL.getProp(),DbConstant.USERNAME.getProp(), DbConstant.PASSWORD.getProp());

            String sql="select email from user_info where user_Id= ? ";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,userId);
            ResultSet resultSet=preparedStatement.executeQuery();
            if (resultSet.next()){
                return resultSet.getString(1);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}

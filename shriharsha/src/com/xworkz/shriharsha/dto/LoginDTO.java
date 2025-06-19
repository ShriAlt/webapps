package com.xworkz.shriharsha.dto;

import java.io.Serializable;

public class LoginDTO implements Serializable {
   private String userName;
   private String password;

    public LoginDTO() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginDTO(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}

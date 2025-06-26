package com.xworkz.comb.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private String userId;
    private String email;
    private String password;
    private String confirmPassword;

    public UserDTO() {
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId='" + userId + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", conformPassword='" + confirmPassword + '\'' +
                '}';
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String conformPassword) {
        this.confirmPassword = conformPassword;
    }

    public UserDTO(String userId, String email, String password, String confirmPassword) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
}

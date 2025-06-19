package com.xworkz.shriharsha.dto;

import java.io.Serializable;

public class RegisterDTO implements Serializable {
    private String name;
    private String fatherName;
    private String motherName;
    private String email;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public RegisterDTO(String name, String fatherName, String motherName, String email, String phoneNumber) {
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public RegisterDTO() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

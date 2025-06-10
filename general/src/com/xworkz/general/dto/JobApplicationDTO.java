package com.xworkz.general.dto;

import java.io.Serializable;

public class JobApplicationDTO implements Serializable {
    private String fullName;
    private String email;
    private String education;
    private String skills;
    private int expectedSalary;
    private String experience;


    public JobApplicationDTO(){}
    public JobApplicationDTO(String fullName, String email, String education, String skills, int expectedSalary, String experience) {
        this.fullName = fullName;
        this.email = email;
        this.education = education;
        this.skills = skills;
        this.expectedSalary = expectedSalary;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(int expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "JobApplicationDTO{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", skills='" + skills + '\'' +
                ", expectedSalary='" + expectedSalary + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}

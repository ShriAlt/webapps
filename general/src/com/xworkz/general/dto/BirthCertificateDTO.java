package com.xworkz.general.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class BirthCertificateDTO implements Serializable {

    private String birthId;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String hospitalName;
    private String fatherName;
    private String motherName;
    private LocalDate dateOfBirth;
    private LocalTime timeOfBirth;
    private String doctorName;
    private  String nurseName;
    private String hospitalType;

    public BirthCertificateDTO(){}

    public BirthCertificateDTO(String birthId, String hospitalName, String fatherName, String motherName, LocalDate dateOfBirth, LocalTime timeOfBirth, String doctorName, String nurseName, String hospitalType) {
        this.birthId = birthId;
        this.hospitalName = hospitalName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.dateOfBirth = dateOfBirth;
        this.timeOfBirth = timeOfBirth;
        this.doctorName = doctorName;
        this.nurseName = nurseName;
        this.hospitalType = hospitalType;
    }

    public String getBirthId() {
        return birthId;
    }

    public void setBirthId(String birthId) {
        this.birthId = birthId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalTime getTimeOfBirth() {
        return timeOfBirth;
    }

    public void setTimeOfBirth(LocalTime timeOfBirth) {
        this.timeOfBirth = timeOfBirth;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public String getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType;
    }

    @Override
    public String toString() {
        return "BirthCertificateDTO{" +
                "birthId='" + birthId + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", timeOfBirth=" + timeOfBirth +
                ", doctorName='" + doctorName + '\'' +
                ", nurseName='" + nurseName + '\'' +
                ", hospitalType='" + hospitalType + '\'' +
                '}';
    }
}

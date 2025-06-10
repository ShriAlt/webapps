package com.xworkz.general.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class DeathCertificateDTO implements Serializable {

    private String fullName;
    private String causeOfDeath;
    private LocalDate dateOfDeath;
    private LocalTime timeOfDeath;
    private int ageAtDeath;
    private String certifiedBy;
    private String hospitalName;
    private String mannerOfDeath;
    private String gender;
    private String identifyingMarks;

    public DeathCertificateDTO() {
    }

    public DeathCertificateDTO(String fullName, String causeOfDeath, LocalDate dateOfDeath, LocalTime timeOfDeath, int ageAtDeath, String certifiedBy, String hospitalName, String mannerOfDeath, String gender, String identifyingMarks) {
        this.fullName = fullName;
        this.causeOfDeath = causeOfDeath;
        this.dateOfDeath = dateOfDeath;
        this.timeOfDeath = timeOfDeath;
        this.ageAtDeath = ageAtDeath;
        this.certifiedBy = certifiedBy;
        this.hospitalName = hospitalName;
        this.mannerOfDeath = mannerOfDeath;
        this.gender = gender;
        this.identifyingMarks = identifyingMarks;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }

    public LocalDate getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(LocalDate dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public LocalTime getTimeOfDeath() {
        return timeOfDeath;
    }

    public void setTimeOfDeath(LocalTime timeOfDeath) {
        this.timeOfDeath = timeOfDeath;
    }

    public int getAgeAtDeath() {
        return ageAtDeath;
    }

    public void setAgeAtDeath(int ageAtDeath) {
        this.ageAtDeath = ageAtDeath;
    }

    public String getCertifiedBy() {
        return certifiedBy;
    }

    public void setCertifiedBy(String certifiedBy) {
        this.certifiedBy = certifiedBy;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getMannerOfDeath() {
        return mannerOfDeath;
    }

    public void setMannerOfDeath(String mannerOfDeath) {
        this.mannerOfDeath = mannerOfDeath;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentifyingMarks() {
        return identifyingMarks;
    }

    public void setIdentifyingMarks(String identifyingMarks) {
        this.identifyingMarks = identifyingMarks;
    }

    @Override
    public String toString() {
        return "DeathCertificateDTO{" +
                "fullName='" + fullName + '\'' +
                ", causeOfDeath='" + causeOfDeath + '\'' +
                ", dateOfDeath=" + dateOfDeath +
                ", timeOfDeath=" + timeOfDeath +
                ", ageAtDeath=" + ageAtDeath +
                ", certifiedBy='" + certifiedBy + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", mannerOfDeath='" + mannerOfDeath + '\'' +
                ", gender='" + gender + '\'' +
                ", identifyingMarks='" + identifyingMarks + '\'' +
                '}';
    }
}

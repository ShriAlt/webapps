package com.xworkz.general.dto;

import java.io.Serializable;

public class DrivingLicenseDTO implements Serializable {
 private String fullName;
 private String address;
 private double mobile;
 private String appliedDate;
 private String vehicleType;

    public DrivingLicenseDTO() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMobile() {
        return mobile;
    }

    public void setMobile(double mobile) {
        this.mobile = mobile;
    }

    public String getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(String appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public DrivingLicenseDTO(String fullName, String address, double mobile, String appliedDate, String vehicleType) {
        this.fullName = fullName;
        this.address = address;
        this.mobile = mobile;
        this.appliedDate = appliedDate;
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "DrivingLicenseDTO{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                ", appliedDate='" + appliedDate + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}

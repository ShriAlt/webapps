package com.xworkz.general.dto;

import java.io.Serializable;

public class PassportDTO implements Serializable {

    private String applicantName;
    private double aadhaarNo;
    private String address;
    private String panNo;
    private String country;
    private String state;
    private String city;
    private int pinCode;
    private String passportType;
    private double paymentRef;

    public PassportDTO() {
    }

    public PassportDTO(String applicantName, double aadhaarNo, String address, String panNo, String country, String state, String city, int pinCode, String passportType, double paymentRef) {
        this.applicantName = applicantName;
        this.aadhaarNo = aadhaarNo;
        this.address = address;
        this.panNo = panNo;
        this.country = country;
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
        this.passportType = passportType;
        this.paymentRef = paymentRef;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public double getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(double aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getPassportType() {
        return passportType;
    }

    public void setPassportType(String passportType) {
        this.passportType = passportType;
    }

    public double getPaymentRef() {
        return paymentRef;
    }

    public void setPaymentRef(double paymentRef) {
        this.paymentRef = paymentRef;
    }

    @Override
    public String toString() {
        return "PassportDTO{" +
                "applicantName='" + applicantName + '\'' +
                ", aadhaarNo=" + aadhaarNo +
                ", address='" + address + '\'' +
                ", panNo=" + panNo +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                ", passportType='" + passportType + '\'' +
                ", paymentRef=" + paymentRef +
                '}';
    }
}

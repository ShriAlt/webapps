package com.xworkz.bank.dto;

import java.io.Serializable;

public class LoanDTO implements Serializable {

    private String fullName;
    private String email;
    private String phone;
    private String loanType;
    private String occupation;
    private String city;
    private int loanAmount;
    private int termsAcceptedInt;

    public LoanDTO(String fullName, String email, String phone, String loanType, String occupation, String city, int loanAmount, int termsAccepted) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.loanType = loanType;
        this.occupation = occupation;
        this.city = city;
        this.loanAmount = loanAmount;
        this.termsAcceptedInt = termsAccepted;
    }

    public LoanDTO() {
        System.out.println("Created LoanDTO using no-arg constructor.");
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

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLoanType() {
        return loanType;
    }
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public int getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int isTermsAccepted() {
        return termsAcceptedInt;
    }
    public void setTermsAccepted(int termsAccepted) {
        this.termsAcceptedInt = termsAccepted;
    }

    @Override
    public String toString() {
        return "LoanDTO [fullName=" + fullName + ", email=" + email + ", phone=" + phone +
                ", loanType=" + loanType + ", occupation=" + occupation + ", city=" + city +
                ", loanAmount=" + loanAmount + ", termsAccepted=" + termsAcceptedInt + "]";
    }
}

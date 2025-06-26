package com.xworkz.otpSender;

import javax.mail.MessagingException;

public class MainRunner {
    public static void main(String[] args) {
        String otp=OtpGenerate.generateOTP(6);
        String toEmail="skandagowda0@gmail.com";
        try {
            MailSender.sendOtpEmail(toEmail,otp);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}

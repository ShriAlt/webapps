package com.xworkz.comb.service;

import com.xworkz.comb.dto.UserDTO;
import com.xworkz.comb.repository.UserRepository;
import com.xworkz.comb.repository.UserRepositoryImpl;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class UserServiceImpl implements UserService {

    @Override
    public String validate(UserDTO dto) {
        UserRepository userRepository=new UserRepositoryImpl();
        if (dto == null) {
            return "Invalid data submitted.";
        }

        String email = dto.getEmail();
        String userId = dto.getUserId();
        String password = dto.getPassword();
        String confirmPassword = dto.getConfirmPassword();

        if (email == null ) {
            return "Invalid email format.";
        }

        if (userId == null || userId.length() < 4) {
            return "User ID must be at least 4 characters.";
        }
        if (password == null || password.length() < 6) {
            return "Password must be at least 6 characters.";
        }
        if (!password.equals(confirmPassword)) {
            return "Password and Confirm Password do not match.";
        }
        if (userRepository.existByUserId(userId)) {
            return "user Id exist";
        }
        if (userRepository.existByMail(email)){
            return "Mail id exists";
        }
        userRepository.save(dto);
        return "true";
    }

    @Override
    public String check(UserDTO dto) {
        UserRepository userRepository=new UserRepositoryImpl();
        if (dto.getUserId().equals(userRepository.checkByUserId(dto.getUserId())) && dto.getPassword().equals(userRepository.checkByPassword(dto.getPassword()))){
            return "true";
        }

        return "false";
    }

    @Override
    public String fetchEmail(UserDTO dto) {
        UserRepository userRepository=new UserRepositoryImpl();
        if (userRepository.existByUserId(dto.getUserId())){
            String email=userRepository.checkForEmail(dto.getUserId());

            return "true";
        }
        return "false";
    }

    @Override
    public void sendOtpEmail(String toEmail, String otp) {
        final String fromEmail = "shriharshakm10@gmail.com";
        final String emailPassword = "bvyt fhuo eoqd frgq";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(fromEmail, emailPassword);
                    }
                });

        Message message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(fromEmail));
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        try {
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        try {
            message.setSubject("Your OTP Code");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        try {
            message.setText("Your OTP is: " + otp);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

        try {
            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("OTP sent successfully to " + toEmail);


    }

    @Override
    public String generateOtp(int length) {
        return "";
    }
}

package com.xworkz.comb.service;

import com.xworkz.comb.dto.ImageDTO;
import com.xworkz.comb.dto.UserDTO;

public interface UserService {
    String validate(UserDTO dto);
    String check(UserDTO dto);
    String checkUserId(UserDTO dto);
    String generateOtp(int length);
     void sendOtpEmail(String toEmail, String otp);
     String validateOtp(String userOtp,String sentOtp,String userId);
     String sendOtp(String userId);
     String updatePassword(String userId,String password,String confirmPassword);
     String validateImage(ImageDTO dto);
     ImageDTO fetchImage(String userId);


}

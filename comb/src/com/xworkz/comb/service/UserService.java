package com.xworkz.comb.service;

import com.xworkz.comb.dto.UserDTO;

public interface UserService {
    String validate(UserDTO dto);
    String check(UserDTO dto);
    String fetchEmail(UserDTO dto);
    String generateOtp(int length);
     void sendOtpEmail(String toEmail, String otp);


}

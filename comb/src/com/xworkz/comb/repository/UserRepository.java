package com.xworkz.comb.repository;

import com.xworkz.comb.dto.ImageDTO;
import com.xworkz.comb.dto.UserDTO;

public interface UserRepository {
    void save(UserDTO dto);
    boolean existByMail(String email);
    boolean existByUserId(String userId);

    String checkByUserId(String userId);
    String checkByPassword(String password);
    String checkForEmail(String userId);
    void updatePassword(String userId,String password);
    void saveImageData(ImageDTO dto);
    ImageDTO fetchById(String userId);
}

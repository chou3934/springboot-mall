package com.melanie.springbootmall.dao;

import com.melanie.springbootmall.dto.UserRegisterRequest;
import com.melanie.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}

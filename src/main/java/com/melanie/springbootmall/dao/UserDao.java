package com.melanie.springbootmall.dao;

import com.melanie.springbootmall.dto.UserRegisterRequest;
import com.melanie.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}

package com.melanie.springbootmall.service;

import com.melanie.springbootmall.dto.UserRegisterRequest;
import com.melanie.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

}

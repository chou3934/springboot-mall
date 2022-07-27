package com.melanie.springbootmall.service.implement;

import com.melanie.springbootmall.dao.implement.UserDaoImpl;
import com.melanie.springbootmall.dto.UserRegisterRequest;
import com.melanie.springbootmall.model.User;
import com.melanie.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoImpl userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}

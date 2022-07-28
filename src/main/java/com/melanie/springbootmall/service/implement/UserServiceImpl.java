package com.melanie.springbootmall.service.implement;

import com.melanie.springbootmall.dao.UserDao;
import com.melanie.springbootmall.dao.implement.UserDaoImpl;
import com.melanie.springbootmall.dto.UserLoginRequest;
import com.melanie.springbootmall.dto.UserRegisterRequest;
import com.melanie.springbootmall.model.User;
import com.melanie.springbootmall.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class UserServiceImpl implements UserService {

    private final  static Logger log= LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDaoImpl userDao;

    @Override
    public User getUserById(Integer userId) {

        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {

        //檢查email
        User user= userDao.getUserByEmail(userRegisterRequest.getEmail());

        if(user!=null){
            log.warn("該 email{} 已註冊",userRegisterRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        //創造
        return userDao.createUser(userRegisterRequest);
    }


    @Override
    public User login(UserLoginRequest userLoginRequest) {
        User user= userDao.getUserByEmail(userLoginRequest.getEmail());

        if(user==null){
            log.warn("該 email{} 尚未註冊",userLoginRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        if(user.getPassword().equals(userLoginRequest.getPassword())){
            return user;
        }else{
            log.warn("email{}  的密碼不正確",userLoginRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }
}

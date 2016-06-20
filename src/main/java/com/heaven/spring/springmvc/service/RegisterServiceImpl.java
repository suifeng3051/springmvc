package com.heaven.spring.springmvc.service;

import com.heaven.spring.springmvc.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by whd@zizizizizi.com on 2016/6/6.
 */
@Service
public class RegisterServiceImpl implements RegisterService{
    public void register(User user){
    }

    public boolean isUserExist(User user) {
        return true;
    }
}

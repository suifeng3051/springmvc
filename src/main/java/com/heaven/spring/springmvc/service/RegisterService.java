package com.heaven.spring.springmvc.service;

import com.heaven.spring.springmvc.model.User;

/**
 * Created by whd@zizizizizi.com on 2016/6/6.
 */
public interface RegisterService {
    public void register(User user);
    public boolean isUserExist(User user);
}

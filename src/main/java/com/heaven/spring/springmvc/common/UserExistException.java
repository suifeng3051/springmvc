package com.heaven.spring.springmvc.common;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by whd@zizizizizi.com on 2016/6/14.
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST,reason="user has exist!")
public class UserExistException extends RuntimeException{

}

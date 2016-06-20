package com.heaven.spring.springmvc.controller;

import com.heaven.spring.springmvc.common.UserExistException;
import com.heaven.spring.springmvc.model.User;
import com.heaven.spring.springmvc.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by whd@zizizizizi.com on 2016/6/6.
 */
@Controller
@RequestMapping("/user")
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping(value = "/registerValid", method = RequestMethod.POST)
    public String processRegistrationValid(@Valid User user, Errors errors) {

        if (errors.hasErrors()) {
            return "register";
        }
        registerService.register(user);
        return "redirect:/user/" + user.getName();
    }

    @RequestMapping(value = "/registerEx", method = RequestMethod.POST)
    public String processRegistrationEx(User user) {
        if (registerService.isUserExist(user)) {
            throw new UserExistException();
        }
        registerService.register(user);
        return "profile";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(User user) {
        registerService.register(user);
        return "profile";
    }

    @ExceptionHandler(UserExistException.class)
    public String handleUserExist() {
        return "error";
    }
}

package com.springmvc.demo.controller;

import com.springmvc.demo.model.User;
import com.springmvc.demo.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
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

    @RequestMapping(value="/register", method= RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute("user",new User());
        return "register";
    }
    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String processRegistration(@Valid User user, Errors errors) {
        if(errors.hasErrors()){
            return "register";
        }
        registerService.register(user);
        return "redirect:/user/" + user.getName();
    }

}

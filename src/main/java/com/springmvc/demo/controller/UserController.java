package com.springmvc.demo.controller;

import com.springmvc.demo.model.EmployeeVO;
import com.springmvc.demo.model.User;
import com.springmvc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/{username}", method=RequestMethod.GET)
    public String showUserProfile(@PathVariable String username, Model model){
        User user = userService.findByUsername(username);
        model.addAttribute(user);
        return "profile";
    }
    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", userService.getAllEmployees());//指定key值为employee
        return "employeesListDisplay";//指定渲染的view名称，返回的字符串即对应的view名称
    }

    @RequestMapping(value = "/getAllEmployees2", method = RequestMethod.GET)
    public String getAllEmployees2(Model model) {
        model.addAttribute(userService.getAllEmployees());//不指定key值，因为对象的类型为List<EmployeeVO>，所以默认key值为employeeVOList
        return "employeesListDisplay";//指定渲染的view名称，返回的字符串即对应的view名称
    }

    @RequestMapping(value = "/employeesListDisplay", method = RequestMethod.GET)
    public  List<EmployeeVO> getAllEmployees3(Model model) {
        return userService.getAllEmployees();//不指定key值，因为对象的类型为List<EmployeeVO>，所以默认key值为employeeVOList
        //若不指定view名称，view名称默认为请求路径名，即RequestMapping中的value值
    }

    @RequestMapping(value = "/getEmployeesByPage", method = RequestMethod.GET)
    public String getEmployeesByPage(@RequestParam(value = "pageNo",defaultValue = "1") long pageNo,@RequestParam(value = "count",defaultValue = "5") long count ,Model model) {
        model.addAttribute(userService.getAllEmployees());
        return "employeesListDisplay";
    }
    @RequestMapping(value = "/queryEmployee", method = RequestMethod.GET)
    public String queryEmployee(@RequestParam(value = "employeeId") long employeeId,Model model){
        model.addAttribute(userService.queryEmployeeVO(employeeId));
        return "employee";
    }

    @RequestMapping(value ="query/{employeeId}", method = RequestMethod.GET)
    public String queryEmployee2(@PathVariable long employeeId, Model model){
        model.addAttribute(userService.queryEmployeeVO(employeeId));
        return "employee";
    }
}
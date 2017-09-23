package com.liutie.controller;

import com.liutie.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping(value = "/login")
    public String toLoginView(Model model){
        userService.userLogin("");
        model.addAttribute("username","liutie");
        return "login";
    }
}

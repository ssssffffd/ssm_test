package com.aaa.bbb.controller;

import com.aaa.bbb.entity.User;
import com.aaa.bbb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;


@Controller
@RequestMapping(value = "/jsp")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(User user, Model model) throws Exception {
        user = userService.checkLogin(user.getUsername(), user.getPassword());
        if (user != null) {
            model.addAttribute("user",user);
            return "main";
        }
        model.addAttribute("error","用户名或密码错误");
        return "login";
    }

    @RequestMapping(value = "/register")
    public String register(User user, Model model) throws Exception {
        if (userService.checkLogin(user.getUsername(), user.getPassword()) == null) {
            userService.register(user);
            model.addAttribute("user",user);
            return "main";
        }
        model.addAttribute("error","用户名已存在");
        return "register";
    }
}

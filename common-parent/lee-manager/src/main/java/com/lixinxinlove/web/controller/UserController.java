package com.lixinxinlove.web.controller;


import com.lixinxinlove.model.User;
import com.lixinxinlove.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("user")
public class UserController {


    @Autowired
    private IUserService userService;


    @RequestMapping("login")
    public String login(Integer id) {
        User user = userService.findById(id);
        System.out.println(user.toString());
        return user.toString();
    }
}

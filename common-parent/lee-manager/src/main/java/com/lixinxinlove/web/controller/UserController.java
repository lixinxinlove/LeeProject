package com.lixinxinlove.web.controller;


import com.lixinxinlove.model.User;
import com.lixinxinlove.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("user")
public class UserController {


    @Autowired
    private IUserService userService;


    @RequestMapping("login")
    public String login(Integer id) {
        User user = userService.findById(id);
        System.out.println(user.toString());
        return "index";
    }

    @RequestMapping("manage")
    public String manage() {
        return "user/UserManage";
    }


    @RequestMapping("edit")
    public String edit() {
        return "user/UserEdit";
    }


    @RequestMapping("info")
    public String info() {
        return "user/UserInfo";
    }

    @RequestMapping("update")
    public String update() {
        return "user/UserUpdate";
    }
}

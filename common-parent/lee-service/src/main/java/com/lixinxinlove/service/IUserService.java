package com.lixinxinlove.service;


import com.lixinxinlove.model.User;
import com.lixinxinlove.service.base.IBaseService;

public interface IUserService extends IBaseService<User> {

    //特有的方法
    User login(String username, String password);
}

package com.lyx.mybatis.controller;

import com.lyx.mybatis.pojo.User;
import com.lyx.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;

/**
 * @ClassName UserController
 * @Descrition TODO()
 * @Author LYX
 * @Date 2018-10-05 23:14
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getUser")
    public String getUserById() {
        //根据id查找用户信息
        User user = userService.getUserById(1);
        return user.getName();
    }
}

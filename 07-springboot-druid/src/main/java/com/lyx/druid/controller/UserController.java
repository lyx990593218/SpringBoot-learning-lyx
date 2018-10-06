package com.lyx.druid.controller;

import com.lyx.druid.pojo.User;
import com.lyx.druid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Descrition TODO()
 * @Author LYX
 * @Date 2018-10-06 8:47
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getUser")
    public String getUser() {
        User user = userService.getUserById(2);
        return user.getName();
    }
}

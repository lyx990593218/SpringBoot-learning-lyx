package com.lyx.mybatispagehelper.controller;

import com.lyx.mybatispagehelper.common.PageResult;
import com.lyx.mybatispagehelper.pojo.User;
import com.lyx.mybatispagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Descrition TODO()
 * @Author LYX
 * @Date 2018-10-06 9:32
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/users/{page}/{pageSize}")
    public PageResult<User> getAllUser(@PathVariable Integer page, @PathVariable Integer pageSize){

        System.out.println(page+"  "+pageSize);
        PageResult<User> result = userService.getUserByPage(page,pageSize);
        return result;
    }

    @RequestMapping("/userlist/{page}/{pageSize}")
    public List<User> getAllUserList(@PathVariable Integer page, @PathVariable Integer pageSize){

        System.out.println(page+"  "+pageSize);
        List<User> result = userService.getUserListByPage(page,pageSize);
        return result;
    }
}

package com.lyx.multipledatasource.controller;

import com.lyx.multipledatasource.pojo.User;
import com.lyx.multipledatasource.pojo.User2;
import com.lyx.multipledatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Descrition TODO(multipledatasource)
 * @Author LYX
 * @Date 2018-10-06 8:47
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    //从数据库test1根据用户id查询用户信息
    @RequestMapping("/test1/getUser")
    public String getUserByIdAndTest1(){
        User user = userService.getUserByIdAndTest1(1);
        return user.getName();
    }
    //从数据库test2根据用户id查询用户信息
    @RequestMapping("/test2/getUser")
    public List<User2> getUserByIdAndTest2(){
        List<User2> user = userService.getUserByIdAndTest2();
        return user;
    }

    //从数据库test1根据用户id查询用户信息
    @RequestMapping("/getUserByPrimaryTemplate")
    public List<User> getUserByPrimaryTemplate(){
        List<User> user = userService.getAllUsersbyprimaryJdbcTemplate();
        return user;
    }
    //从数据库test2根据用户id查询用户信息
    @RequestMapping("/getUserBySecondTemplate")
    public List<User2> getUserBySecondTemplate(){
        List<User2> user = userService.getAllUsersbysecondaryJdbcTemplate();
        return user;
    }
}

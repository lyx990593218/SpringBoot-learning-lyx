package com.lyx.mybatisannotation.service.impl;

import com.lyx.mybatisannotation.mapper.UserMapper;
import com.lyx.mybatisannotation.pojo.User;
import com.lyx.mybatisannotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Descrition TODO()
 * @Author LYX
 * @Date 2018-10-06 8:49
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(int id){
        return userMapper.getUserById(id);
    }
}

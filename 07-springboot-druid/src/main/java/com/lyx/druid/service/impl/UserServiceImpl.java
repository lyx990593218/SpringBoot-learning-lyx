package com.lyx.druid.service.impl;

import com.lyx.druid.mapper.UserMapper;
import com.lyx.druid.pojo.User;
import com.lyx.druid.service.UserService;
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

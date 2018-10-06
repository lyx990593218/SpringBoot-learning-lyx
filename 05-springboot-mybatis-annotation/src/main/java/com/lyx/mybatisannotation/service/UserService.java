package com.lyx.mybatisannotation.service;

import com.lyx.mybatisannotation.pojo.User;

/**
 * @ClassName UserService
 * @Descrition TODO()
 * @Author LYX
 * @Date 2018-10-06 8:49
 * @Version 1.0
 */
public interface UserService {
    User getUserById(int id);
}

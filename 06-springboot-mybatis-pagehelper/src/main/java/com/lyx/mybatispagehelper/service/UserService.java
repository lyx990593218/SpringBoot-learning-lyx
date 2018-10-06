package com.lyx.mybatispagehelper.service;

import com.lyx.mybatispagehelper.common.PageResult;
import com.lyx.mybatispagehelper.pojo.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Descrition TODO()
 * @Author LYX
 * @Date 2018-10-06 9:32
 * @Version 1.0
 */
public interface UserService {
    PageResult<User> getUserByPage(Integer page, Integer pageSize);

    List<User> getUserListByPage(Integer page, Integer pageSize);
}

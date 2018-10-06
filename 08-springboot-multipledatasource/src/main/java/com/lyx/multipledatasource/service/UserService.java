package com.lyx.multipledatasource.service;

import com.lyx.multipledatasource.pojo.User;
import com.lyx.multipledatasource.pojo.User2;

import java.util.List;

/**
 * @ClassName UserService
 * @Descrition TODO()
 * @Author LYX
 * @Date 2018-10-06 8:49
 * @Version 1.0
 */
public interface UserService {
    //从test1数据库中根据id查找用户信息
    User getUserByIdAndTest1(int id);
    //从test2数据库中根据id查找用户信息
    List<User2> getUserByIdAndTest2();

    public List<User> getAllUsersbyprimaryJdbcTemplate();

    public List<User2> getAllUsersbysecondaryJdbcTemplate();
}

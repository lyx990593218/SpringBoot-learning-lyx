package com.lyx.multipledatasource.service.impl;

import com.lyx.multipledatasource.mapper.test1.User1Mapper;
import com.lyx.multipledatasource.mapper.test2.User2Mapper;
import com.lyx.multipledatasource.pojo.User;
import com.lyx.multipledatasource.pojo.User2;
import com.lyx.multipledatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

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
    private User1Mapper user1Mapper;
    @Autowired
    private User2Mapper user2Mapper;

    //从test1数据库中根据id查找用户信息
    public User getUserByIdAndTest1(int id){
        return user1Mapper.getUserById(id);
    }
    //从test2数据库中根据id查找用户信息
    public List<User2> getUserByIdAndTest2(){
        return user2Mapper.getUserById();
    }

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    private JdbcTemplate primaryJdbcTemplate;
    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    private JdbcTemplate secondaryJdbcTemplate;
    @Override
    public List<User> getAllUsersbyprimaryJdbcTemplate() {
        List list = primaryJdbcTemplate.queryForList("SELECT ID, NAME, AGE FROM USER");
        return list;
    }
    @Override
    public List<User2> getAllUsersbysecondaryJdbcTemplate() {
        List list = secondaryJdbcTemplate.queryForList("SELECT HOST, USER, PASSWORD FROM USER");
        return list;
    }
}


package com.lyx.mybatis.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.lyx.mybatis.pojo.User;
import com.lyx.mybatis.mapper.UserDao;

/**
 * @ClassName UserService
 * @Descrition TODO()
 * @Author LYX
 * @Date 2018-10-05 23:16
 * @Version 1.0
 */
@Service
public class UserService{

    @Resource
    private UserDao userDao;

    public int insert(User pojo){
        return userDao.insert(pojo);
    }

    public int insertSelective(User pojo){
        return userDao.insertSelective(pojo);
    }

    public int insertList(List<User> pojos){
        return userDao.insertList(pojos);
    }

    public int update(User pojo){
        return userDao.update(pojo);
    }

    public User getUserById(int id){
        return userDao.getUserById(id);
    }
}

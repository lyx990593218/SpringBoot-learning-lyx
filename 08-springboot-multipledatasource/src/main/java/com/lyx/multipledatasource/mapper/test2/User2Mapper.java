package com.lyx.multipledatasource.mapper.test2;

import com.lyx.multipledatasource.pojo.User2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Descrition TODO()
 * @Author LYX
 * @Date 2018-10-06 18:53
 * @Version 1.0
 */
@Mapper
public interface User2Mapper {
    @Select("SELECT host,user,password FROM USER")
    List<User2> getUserById();
}

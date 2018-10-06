package com.lyx.mybatispagehelper.mapper;

import com.lyx.mybatispagehelper.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Descrition TODO()
 * @Author LYX
 * @Date 2018-10-06 9:32
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM USER")
    List<User> getAllUser();
}

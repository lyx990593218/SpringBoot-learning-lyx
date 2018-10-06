package com.lyx.mybatisannotation.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.lyx.mybatisannotation.pojo.User;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName UserMapper
 * @Descrition TODO()
 * @Author LYX
 * @Date 2018-10-06 8:48
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    @Select("SELECT id,name,age FROM USER WHERE ID = #{id}")
    User getUserById(int id);
}

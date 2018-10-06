package com.lyx.multipledatasource.mapper.test1;

import com.lyx.multipledatasource.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName UserMapper
 * @Descrition TODO()
 * @Author LYX
 * @Date 2018-10-06 18:53
 * @Version 1.0
 */
@Mapper
public interface User1Mapper {
    @Select("SELECT id,name,age FROM USER WHERE ID = #{id}")
    User getUserById(int id);
}

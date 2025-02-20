package org.example.springbtdemohm.mybatisdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.springbtdemohm.mybatisdemo.pojo.User;

@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    public User findById(Integer id);
}

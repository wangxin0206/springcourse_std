package org.itforjava.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.itforjava.entity.User;

@Mapper
public interface UserMapper {

    @Select("select * from user where username=#{username}")
    User findByUsername(String username);

    @Insert("insert into user(username,password,create_time,update_time) values (#{username},#{password},now(),now())")
    void add(String username, String password);
    @Update("update user set email=#{email},user_pic=#{userPic},update_time=now()")
    boolean update(User updateUser);
}

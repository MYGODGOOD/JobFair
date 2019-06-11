package com.zp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zp.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

    @Select(value = "select username,password from user  where username=#{username}")
    @Results({@Result(property = "username",column = "username"),
            @Result(property = "password",column = "password")})
    User findUserByName(@Param("username") String username);


    @Insert("insert into user(username,password,email) values (#{username},#{password},#{email})")
    void register(User user);


    @Select("select uid from user  where username = #{username} and password = #{password}")
    Integer login(User user);

    @Insert("insert into user email values #{email}")
    void addEmail(User user);

    @Select("select * from user where password=#{password} and username=#{username}")
    User selectByPassword(String password,String username);


    @Update("Update user set password=#{password} where uid=#{uid}")
    int updateByPrimaryKeySelective(User record);

    @Select("select * from user where uid=#{uid}")
    User findUserByUid(Integer uid);






}

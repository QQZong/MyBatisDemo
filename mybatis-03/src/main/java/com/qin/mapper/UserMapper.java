package com.qin.mapper;

import com.qin.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /*获取数据列表*/
    @Select("select * from user")
    List<User> getUserList();

    /*根据ID查询用户*/
    @Select("select * from user where id = #{userid} and username = #{name}")
    User getUserByID(@Param("userid") int id,@Param("name") String username);

    /*添加用户*/
    int insertUser(User user);

    /*修改用户*/
    int updateUser(User user);

    /*删除用户*/
    int deleteUser(int id);

    /*模糊查询*/
    List<User> findUserByName(String name);

    /*分页查询*/
    List<User> getUserLimit(Map<String,Integer>map);
}

package com.qin.mapper;

import com.qin.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /*获取数据列表*/
    List<User> getUserList();

    /*根据ID查询用户*/
    User getUserByID(int id);

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

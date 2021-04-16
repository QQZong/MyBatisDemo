package com.qin.tool.mapper;

import com.qin.tool.entity.User;
import java.util.List;

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
}

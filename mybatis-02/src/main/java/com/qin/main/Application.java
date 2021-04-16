package com.qin.main;

import com.qin.mapper.UserMapper;
import com.qin.pojo.User;
import com.qin.tool.MyBatisTool;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisTool.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}

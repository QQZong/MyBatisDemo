package com.qin.main;

import com.qin.mapper.UserMapper;
import com.qin.pojo.User;
import com.qin.tool.MyBatisTool;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisTool.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex",3);
        map.put("pageSize",3);
        List<User> userList = mapper.getUserLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }
    }
}

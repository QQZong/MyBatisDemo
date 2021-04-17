package com.qin.application;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.qin.mapper.UserMapper;
import com.qin.pojo.User;
import com.qin.tool.MyBatisTool;
import org.apache.ibatis.session.SqlSession;

public class App {
    public static void main(MysqlxDatatypes.Scalar.String[] args) {
        SqlSession sqlSession = MyBatisTool.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User id = mapper.getUserByID(1,"张三");
        System.out.println(id);
    }
}

package com.qin.application;

import com.qin.entity.User;
import com.qin.mapper.UserMapper;
import com.qin.tool.MyBatisTool;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        SqlSession sqlSession= null;
        /*官方建议加try catch*/
        try {
            sqlSession = MyBatisTool.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);

            /*查询所有用户*/
            /*List<User> userList = mapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }*/

            /*根据ID查询用户*/
            /*User user = mapper.getUserByID(1);
            System.out.println(user);*/

            /*添加用户*/
            /*int i = mapper.insertUser(new User(4, "老某人", "321"));
            *//*提交事务*//*
            sqlSession.commit();
            if (i>0){
                System.out.println("插入成功...");
            }else {
                System.out.println("插入失败...");
            }*/

            /*修改用户*/
            /*int user = mapper.updateUser(new User(4, "哈哈", "111"));
            sqlSession.commit();
            if (user>0){
                System.out.println("修改成功...");
            }else {
                System.out.println("修改失败...");
            }*/

            /*删除用户*/
            /*int i = mapper.deleteUser(4);
            sqlSession.commit();
            if (i>0){
                System.out.println("删除成功...");
            }else {
                System.out.println("删除失败...");
            }*/

            /*模糊查询*/
            List<User> name = mapper.findUserByName("李");/*通配符传值%%*/
            for (User user : name) {
                System.out.println(user);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}

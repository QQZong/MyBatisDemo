package com.qin.main;

import com.qin.entity.Teacher;
import com.qin.mapper.TeacherMapper;
import com.qin.tool.MyBatisTool;
import org.apache.ibatis.session.SqlSession;

public class Application {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisTool.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        /**
         * Teacher(id=0, tName=魔道天尊, studentList=[Student(id=1, sName=张三丰, tid=0), Student(id=2, sName=张无忌, tid=0), Student(id=3, sName=赵敏, tid=0), Student(id=4, sName=杨过, tid=0)])
         */
        System.out.println(teacher);
    }
}

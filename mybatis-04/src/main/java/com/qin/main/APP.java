package com.qin.main;

import com.qin.entity.Teacher;
import com.qin.mapper.TeacherMapper;
import com.qin.tool.MyBatisTool;
import org.apache.ibatis.session.SqlSession;

public class APP {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisTool.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
    }
}

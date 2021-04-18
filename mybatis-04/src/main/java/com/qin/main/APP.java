package com.qin.main;

import com.qin.entity.Student;
import com.qin.entity.Teacher;
import com.qin.mapper.StudentMapper;
import com.qin.mapper.TeacherMapper;
import com.qin.tool.MyBatisTool;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class APP {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisTool.getSqlSession();
        /*TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);*/
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudentWayTow();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}

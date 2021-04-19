package com.qin.mapper;

import com.qin.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    Teacher getTeacher(@Param("tid")int id);

}

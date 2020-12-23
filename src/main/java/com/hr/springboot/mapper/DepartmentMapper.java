package com.hr.springboot.mapper;

import com.hr.springboot.pojo.Department;
import org.apache.ibatis.annotations.*;

//@Mapper
public interface DepartmentMapper {
    @Select("select * from department where id=#{id}")
    Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    int deleteDeptById(Integer id);

    //useGeneratedKeys = true,keyProperty = "id"封装主键id 并返回
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    int inserDept(Department department);

    @Update("update department set departmentName=#{department_name} where id=#{id}")
    int updateDept(Department department);
}

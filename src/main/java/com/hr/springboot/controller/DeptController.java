package com.hr.springboot.controller;


import com.hr.springboot.mapper.DepartmentMapper;
import com.hr.springboot.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeptController {

    @Autowired
    private DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id) {
        Department dept = departmentMapper.getDeptById(id);
        return dept;
    }

    @RequestMapping("/dept")
    public Department insertDept(Department department) {
        departmentMapper.inserDept(department);
        return department;
    }
}

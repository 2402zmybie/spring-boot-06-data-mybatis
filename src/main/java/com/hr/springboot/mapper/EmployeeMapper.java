package com.hr.springboot.mapper;

import com.hr.springboot.pojo.Employee;

public interface EmployeeMapper {

    Employee getEmpById(Integer id);

    void insertEmp(Employee employee);
}

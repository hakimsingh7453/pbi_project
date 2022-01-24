package com.example.pbi_project.service;

import com.example.pbi_project.dto.EmployeeDto;
import com.example.pbi_project.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<EmployeeDto> listEmployeeid();
    List<EmployeeDto> listdto();
}

package com.example.pbi_project.serviceimpl;

import com.example.pbi_project.model.Employee;
import com.example.pbi_project.model.Sallery;
import com.example.pbi_project.repository.EmployeeRepository;
import com.example.pbi_project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}

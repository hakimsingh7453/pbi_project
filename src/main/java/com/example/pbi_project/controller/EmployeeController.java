package com.example.pbi_project.controller;


import com.example.pbi_project.dto.EmployeeDto;
import com.example.pbi_project.model.Employee;
import com.example.pbi_project.service.EmployeeService;
import com.example.pbi_project.serviceimpl.EmployeeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(value = "/addEmployee")
    public  ResponseEntity<Employee> saveEmployee( @RequestBody  Employee employee){
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping(value = "/getEmail")
    public List<EmployeeDto> listEmail(){
        return employeeService.listEmployeeid();
    }

    @GetMapping(value = "/")
    public String welcomemessage(){
        return "Authorised....";
    }


    @GetMapping(value = "")
    public String welcome(){
        return "Your Welome in this page 2";
    }

    @GetMapping(value = "/getdto")
    public List<EmployeeDto> getDto(){
        return employeeService.listdto();
    }

}

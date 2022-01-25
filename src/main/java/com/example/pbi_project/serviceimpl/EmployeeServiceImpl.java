package com.example.pbi_project.serviceimpl;

import com.example.pbi_project.dto.EmployeeDto;
import com.example.pbi_project.model.Employee;
import com.example.pbi_project.model.Sallery;
import com.example.pbi_project.repository.EmployeeRepository;
import com.example.pbi_project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<EmployeeDto> listEmployeeid() {
        return employeeRepository.findAll().stream().map(this::entitydto).collect(Collectors.toList());
    }

    @Override
    public List<EmployeeDto> listdto() {
        return employeeRepository.getdto();
    }

    private EmployeeDto entitydto(Employee employee){
        EmployeeDto employeeDto=new EmployeeDto();
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setEmail(employee.getEmail());

        return employeeDto;
    }
}

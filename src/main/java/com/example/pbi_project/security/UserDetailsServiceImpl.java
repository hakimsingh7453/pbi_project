package com.example.pbi_project.security;

import com.example.pbi_project.model.Employee;
import com.example.pbi_project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private EmployeeRepository employeeRepository;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Employee employee= employeeRepository.getUserByUsername(username);
        if(employee==null) throw new UsernameNotFoundException("Could not find User");
        else return new CustomUserDetails(employee);
    }
}

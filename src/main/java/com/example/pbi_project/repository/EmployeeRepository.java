package com.example.pbi_project.repository;
import com.example.pbi_project.dto.EmployeeDto;
import com.example.pbi_project.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query(value = "select e.Email,e.FirstName,e.LastName from Employee e",nativeQuery = true)
    List<EmployeeDto> getdto();

    @Query("SELECT e FROM Employee e WHERE e.Email = :username")
    public Employee getUserByUsername(@Param("username") String username);
}

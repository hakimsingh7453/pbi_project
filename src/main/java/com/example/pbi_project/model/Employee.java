package com.example.pbi_project.model;


import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname")
    private String FirstName;

    @Column(name = "lastname")
    private String LastName;

    @Column(name = "email")
    private String Email;

    @Column(name = "mobile")
    private String Mobile;

    @Column(name = "dateofbirth")
    private String DateOfBirth;

    @Column(name = "password")
    private String Password;

    @Column(name = "role")
    private String Role;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "employee")
    private List<Sallery> sallery=new ArrayList<>();

    public List<Sallery> getSallery() {
        return sallery;
    }

    public void setSallery(List<Sallery> sallery) {
        this.sallery = sallery;
    }

}

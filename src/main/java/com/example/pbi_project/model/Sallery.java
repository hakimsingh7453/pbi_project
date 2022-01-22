package com.example.pbi_project.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "sallery")
public class Sallery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sal_id;

    @Column(name = "sallerymonth")
    private String SalleryMonth;

    @Column(name = "ammount")
    private long Ammount;

    @ManyToOne
    @JoinColumn(name="emp_id")
    private Employee employee;

    public Sallery(String salleryMonth, long ammount) {
        SalleryMonth = salleryMonth;
        Ammount = ammount;
    }

    public Sallery(String salleryMonth) {
        SalleryMonth = salleryMonth;
    }

    public Sallery() {

    }
}

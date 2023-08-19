package io.zipcoder.persistenceapp.models;

import io.zipcoder.persistenceapp.models.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer number;
    private String name;
    private Employee manager;

    public Department(){}
    public Department (String nameofDepartment, Employee manager) {
        this.number = null;
        this.name = nameofDepartment;
        this.manager = manager;
    }

    public Department (Integer number,String nameofDepartment, Employee manager) {
        this.number = number;
        this.name  =nameofDepartment;
        this.manager = manager;
    }


 }

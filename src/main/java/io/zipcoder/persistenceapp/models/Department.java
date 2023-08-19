package io.zipcoder.persistenceapp.models;

import io.zipcoder.persistenceapp.models.Employee;

public class Department {
    private Integer number;
    private String name;
    private Employee manager;

    public Department (Integer number,String nameofDepartment, Employee manager) {
        this.number = number;
        this.name  =nameofDepartment;
        this.manager = manager;
    }

    public Department () {
        this.number = 0;
        this.name = "";
        this.manager = null;
    }
 }

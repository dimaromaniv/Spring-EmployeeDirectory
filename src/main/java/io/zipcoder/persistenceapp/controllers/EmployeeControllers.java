package io.zipcoder.persistenceapp.controllers;

import io.zipcoder.persistenceapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeControllers {

    @Autowired
    private EmployeeService service;

    public EmployeeControllers(EmployeeService service){
        this.service = service;
    }
}

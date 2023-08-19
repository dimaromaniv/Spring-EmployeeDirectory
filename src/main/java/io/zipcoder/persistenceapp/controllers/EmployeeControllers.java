package io.zipcoder.persistenceapp.controllers;

import io.zipcoder.persistenceapp.models.Employee;
import io.zipcoder.persistenceapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeControllers {

    @Autowired
    private EmployeeService service;

    public EmployeeControllers(EmployeeService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Iterable<Employee>> index() {

        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity <Employee> show (@PathVariable Long id){
        return new ResponseEntity<>(service.show(id),HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<Employee> create (@RequestBody Employee employee){
        return new ResponseEntity<>(service.create(employee),HttpStatus.CREATED);
    }
     @PutMapping(value = "/{id}")
    public ResponseEntity<Employee> update (@PathVariable Long id,@RequestBody Employee employee) {
        return new ResponseEntity<>(service.update(id,employee),HttpStatus.OK);
     }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {

        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}

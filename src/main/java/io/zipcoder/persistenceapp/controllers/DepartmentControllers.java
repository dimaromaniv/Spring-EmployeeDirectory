package io.zipcoder.persistenceapp.controllers;

import io.zipcoder.persistenceapp.models.Department;
import io.zipcoder.persistenceapp.models.Employee;
import io.zipcoder.persistenceapp.services.DepartmentService;
import io.zipcoder.persistenceapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentControllers {
    @Autowired
    private DepartmentService departmentService;

    public DepartmentControllers(DepartmentService departmentService){
        this.departmentService = departmentService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Department>> index() {

        return new ResponseEntity<>(departmentService.index(), HttpStatus.OK);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity <Department> show (@PathVariable Long id){
        return new ResponseEntity<>(departmentService.show(id),HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<Department> create (@RequestBody Department department){
        return new ResponseEntity<>(departmentService.create(department),HttpStatus.CREATED);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<Department> update (@PathVariable Long id,@RequestBody Department department) {
        return new ResponseEntity<>(departmentService.update(id,department),HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {

        return new ResponseEntity<>(departmentService.delete(id), HttpStatus.OK);
    }
}

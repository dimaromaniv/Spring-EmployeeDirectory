package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.models.Employee;
import io.zipcoder.persistenceapp.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private EmployeeRepository repository;


    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Iterable<Employee> index() {
        return repository.findAll();
    }

    public Employee show(Long id) {
        return null;
    }

    public Employee create(Employee employee) {
        return repository.save(employee);
    }

    public Employee update(Long id, Employee employee) {
        return null;
    }
    public Boolean delete(Long id) {

        return null;
    }

}

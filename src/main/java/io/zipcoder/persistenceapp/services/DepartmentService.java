package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.models.Department;
import io.zipcoder.persistenceapp.models.Employee;
import io.zipcoder.persistenceapp.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentService (DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
    public Iterable<Department> index() {
        return departmentRepository.findAll();
    }

    public Department show(Long id) {
        return null;
    }

    public Department create(Department department) {
        return departmentRepository.save(department);
    }

    public Department update(Long id, Department department) {
        return null;
    }
    public Boolean delete(Long id) {

        return null;
    }


}

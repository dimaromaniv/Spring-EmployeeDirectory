package io.zipcoder.persistenceapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements ReporterToManagers, middleManagers, Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idNumber;
    private String firstName;
    private String lastName;
    private String title;
    private Integer phoneNumber;
    private String email;
    private Double hireDate;
    //  private Boolean manager;
    //Department number(key from Department.dpt_num)

    public Employee(Long idNumber, String firstName, String lastName, String title, Integer phoneNumber, String email, Double hireDate, Boolean manager) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.hireDate = hireDate;

    }

    public Employee() {
        this.idNumber = 0L;
        this.firstName = "";
        this.lastName = "";
        this.title = "";
        this.phoneNumber = 0;
        this.email = "";
        this.hireDate = 0.0;

    }

    public Long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getHireDate() {
        return hireDate;
    }

    public void setHireDate(Double hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String makeReport() {
        return null;
    }

    @Override
    public String acceptReport() {
        return null;
    }
}

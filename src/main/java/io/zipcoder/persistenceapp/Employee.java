package io.zipcoder.persistenceapp;

public class Employee {

   private Integer idNumber;
    private String firstName;
    private String lastName;
    private  String title;
    private  Integer phoneNumber;
    private String email;
    private  Double hireDate;
  //  private Boolean manager;
    //Department number(key from Department.dpt_num)

     public Employee(Integer idNumber, String firstName, String lastName, String title, Integer phoneNumber, String email, Double hireDate, Boolean manager){
         this.idNumber = idNumber;
         this.firstName  =firstName;
         this.lastName = lastName;
         this.title = title;
         this.phoneNumber = phoneNumber;
         this.email = email;
         this.hireDate = hireDate;

     }
    public Employee( ){
        this.idNumber = 0;
        this.firstName  ="";
        this.lastName = "";
        this.title = "";
        this.phoneNumber = 0;
        this.email = "";
        this.hireDate = 0.0;

    }


}

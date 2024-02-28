package Inheritance4;

public class Employee extends Department{

    public String employeeName;
    public Employee(String name,String departmentName,String employeeName){
        super(name,departmentName);
        this.employeeName=employeeName;


    }

    



}

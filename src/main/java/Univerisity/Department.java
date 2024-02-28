package Univerisity;

import java.util.ArrayList;
import java.util.List;

public class Department {
   String departmentName;
   List<Proffesor> proffesors = new ArrayList<>();
   List<Course> courses= new ArrayList<>();
    public Department(String departmentName){
        this.departmentName=departmentName;
    }



public void addMember(Proffesor proffesor){
        proffesors.add(proffesor);
}
public void addMember (Course course){
        courses.add(course);
}
 public void  displayDepartmentInfo(){
     System.out.println("Department:" + departmentName);
     System.out.println("course");
     for (Course c: courses){c.displayCourseInfo();
 }

     System.out.println("Pofessors:");
     for (Proffesor proffesor:proffesors){
         proffesor.print();
     }
}}

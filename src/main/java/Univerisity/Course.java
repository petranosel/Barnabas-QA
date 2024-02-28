package Univerisity;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
  String courseCode;
    List<Student> enrolledStudents= new ArrayList<>();
    public Course(String courseName,String courseCode){
        this.courseName=courseName;
        this.courseCode=courseCode;

    }
public void enrollStudent(Student student) {
    if (!enrolledStudents.contains(student)) {
        enrolledStudents.add(student);
    } else {
        System.out.println("Student:" + student.name + "is already in" + courseName);

    }
}

public void displayCourseInfo (){
    System.out.println("Course:" + courseName+ "  " +courseCode);
    System.out.println(" enrolled Students:");
    for( Student student:enrolledStudents){student.print();}
}



}

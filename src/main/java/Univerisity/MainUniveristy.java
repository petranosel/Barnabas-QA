package Univerisity;

public class MainUniveristy {
    public static void main(String[] args) {
        Department computerScience=new Department("Computer Science");
        Proffesor profjohn= new Proffesor("John",8,"90");
        computerScience.addMember(profjohn);

        Student a = new Student("ty",7,"89");
        Student b= new Student("Seun",8, "90");


        Course alogorithim = new Course("alogorithim", "10");
        computerScience.addMember(alogorithim);



 alogorithim.enrollStudent(a);
 alogorithim.enrollStudent(b);
 computerScience.displayDepartmentInfo();




    }}

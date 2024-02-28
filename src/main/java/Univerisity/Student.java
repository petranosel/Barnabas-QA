package Univerisity;

public class Student extends Person {
    String studentId;
    public Student(String name,int age,String studentId){
        super( name,age);
        this.studentId=studentId;
    }
@Override
    public void print(){
        super.print();
    System.out.println(" Student Id:" + studentId);
}

}

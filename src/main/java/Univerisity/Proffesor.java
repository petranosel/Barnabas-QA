package Univerisity;

public class Proffesor extends Person {
  String employeeId;
    public Proffesor( String name,int age,String employeeId){
        super(name,age);
        this.employeeId=employeeId;

    }
@Override
public void print(){
        super.print();

    System.out.println( "Employee Id:" + employeeId);
}
}


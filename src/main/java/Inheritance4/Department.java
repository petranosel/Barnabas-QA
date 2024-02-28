package Inheritance4;

public class Department extends Company {
    private String departmentName;
    public Department(String name,String departmentName){
        super(name);
        this.departmentName=departmentName;
    }

public String getDepartmentName(){
        return departmentName;
}
public void setDepartmentName(String departmentName){
        this.departmentName=departmentName;
}


}

package Inheritance4;
//1 to 1 parent one child
// 1 > many one parent many children
// multi inheritance one parent and many grand children
public class Company {
    private String name;
    public Company(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

}

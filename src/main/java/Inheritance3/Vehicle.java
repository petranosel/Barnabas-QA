package Inheritance3;

public class Vehicle {
    private  String type;
    private String description;
    public   Vehicle (String type, String description){
        this.type= type;
        this.description=description;

    }
public void startEngine(){
    System.out.println("Engine Starting....");
}
public void stopEngine(){
    System.out.println("Engine Stopinig....");
}
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}





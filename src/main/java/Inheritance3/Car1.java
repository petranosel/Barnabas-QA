package Inheritance3;

public class Car1 extends Vehicle{

    private int NumberOfSeats;
    public Car1(String type, String description , int numberOfSeats  ){
        super(type, description);
        this.NumberOfSeats=numberOfSeats;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }
public void setNumberOfSeats(int numberOfSeats){
        NumberOfSeats=numberOfSeats;
}
public  void honk(){
    System.out.println("Car is honking");
}



}




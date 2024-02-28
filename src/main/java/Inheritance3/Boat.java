package Inheritance3;

public class Boat extends Vehicle{

    private double length;

    public Boat(String type,String description, double length){
        super(type,description);
        this.length=length;

    }

    public void anchor(){
        System.out.println("Anchoring the boat.....");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}

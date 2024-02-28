package oopconcepts;

public class Boat extends Vehicle { protected  int speed;
    public Boat(String name,String Color,int speed,String description){
        super(name,description,Color);
        this.speed=speed;
    }

    public void printBoat() {
        System.out.println(name+"  " + type+" "+description+" "+speed+" "+"Sailing on the water.");




}}

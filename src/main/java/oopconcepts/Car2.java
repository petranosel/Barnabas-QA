package oopconcepts;

public class Car2 extends Vehicle {protected String Color;

    // Constructor for Car
    public Car2(String name, String description, String Color, String type) {
        super(name,description,type);
        this.Color= Color;
    }

    // Additional methods for Car
    public void printDetails() {
        System.out.println(name+"  " + type+" "+description+"+" +"Honk");


    }


}

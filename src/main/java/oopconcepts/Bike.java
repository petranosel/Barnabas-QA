package oopconcepts;

public class Bike extends Vehicle {protected String Color;

    public Bike(String name,String Color,String type,String description){
        super(name,description,type);
        this.Color=Color;
    }
    public void PrintDetails() {
        System.out.println(name+"  " + type+" "+"ring"+" "+description);
}}

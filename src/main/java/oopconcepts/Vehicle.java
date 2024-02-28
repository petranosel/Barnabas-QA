package oopconcepts;

public class Vehicle {
    protected String type;
    protected String name;
    protected String description;

    public Vehicle (String name,String type,String description){
        this.type = type;
        this.name = name;
        this.description = description;}

    public void start() {
        System.out.println(description+"  " + type + "  " + name + " is starting.");
    }

    public void stop() {
        System.out.println(description+" " + type + "  " + name +  " is stopping.");
    }


}


package oopconcepts;

public class Inheritance2 {
    public static void main(String[] args) {
        Car2 car= new Car2("Toyota","New","White","Suv");
        Bike bike = new Bike("Giant","Red","Mountain Bike","Used");
        Boat boat = new Boat("Titanic","Black",60,"New");

car.printDetails();
car.start();
car.stop();
        System.out.println("==============");
bike.PrintDetails();
bike.start();
bike.stop();
        System.out.println("==============");
        boat.printBoat();
        boat.start();
        boat.stop();




    }
}

package Jabstaction;

public class realExample {
    public static void main(String[] args) {
 Vehicle myCar = new Car ("Toyota","suv",2024);
   myCar.start();
   myCar.fuelEfficiency();
   myCar.maintainanceschedule();
   myCar.stop();

    Vehicle myMotorcycle = new Motorcycle("Honda","yamaha",2020);
     myMotorcycle.fuelEfficiency();
     myMotorcycle.stop();
     myMotorcycle.maintainanceschedule();

    }}

abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;


    }

    public void start() {
        System.out.println(this.make + " " + this.model + " " + this.year + " " + " is starting");
    }

    public void stop() {
        System.out.println(this.make + " " + this.model + " " + this.year + " " + " is stoping");
    }

    public abstract double fuelEfficiency();


    public abstract String maintainanceschedule();

}

    class Motorcycle extends Vehicle {

        public Motorcycle(String make, String model, int year) {
            super(make, model, year);
        }
@Override
        public double fuelEfficiency() {
            return 40.0;

        }

        @Override
        public String maintainanceschedule() {
            return "Every 6000 miles or 6 months";
        }
    }


    class Car extends Vehicle {
        public Car(String make, String model, int year) {
            super(make,model,year);
        }
    @Override



    public double fuelEfficiency(){
            return 25.0;
    }
    @Override
        public String maintainanceschedule(){
            return " Reuturn 12,000 every 12 months";
    }
    }




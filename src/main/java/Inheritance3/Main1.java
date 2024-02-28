package Inheritance3;

public class Main1 {
    public static void main(String[] args) {
        Car1 mycar=new Car1( "Car","A family car",6);
        mycar.setType("Sedan");


        System.out.println(("type:" + mycar.getType()));
        System.out.println(("desciption:" + mycar.getDescription()));
    mycar.startEngine();
    mycar.honk();
    mycar.stopEngine();


        System.out.println();//addinig a blank line

        //creating a bike instance

        Bike  myBike= new Bike("Bike","Moubtain Bike",true);
        myBike.setHasBasket(false);
        System.out.println(  );
        System.out.println(  );
        System.out.println(  );
         myBike.startEngine();
         myBike.ringBell();
         myBike.stopEngine();

        System.out.println();// adding blank line

        Boat myBoat= new Boat("Boat","A small fishig boat",10.5);
        System.out.println( );
        System.out.println();
        myBoat.startEngine();
        myBoat.stopEngine();
        myBoat.anchor();
        myBoat.stopEngine();

    }
}

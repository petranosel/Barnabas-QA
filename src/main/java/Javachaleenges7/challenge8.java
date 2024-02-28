package Javachaleenges7;

public class challenge8 {

    public static void main(String[] args) {
        caughtSpeedinig (60,false);
        caughtSpeedinig (65,false);
        caughtSpeedinig (65,true);
    }

public  static String caughtSpeedinig (int speed, boolean isBirthday){
   int limit =isBirthday ? 5:0;
 if ( speed <=60 + limit){
     System.out.println("No Ticket");
     return "No Ticket";
 }else if ( speed<=80 + limit){
     System.out.println("Small Ticket");
      return "Small Ticket";
 } else {
     System.out.println(" Big Ticket");
    return "BIg Ticket";}
}
}
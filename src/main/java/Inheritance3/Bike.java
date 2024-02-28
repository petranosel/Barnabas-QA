package Inheritance3;

public class Bike extends Vehicle {
    private boolean hasBasket;
    public Bike (String type,String description,boolean hasBasket){
        super(type,description);
        this.hasBasket=hasBasket;
    }
  public  void ringBell(){
      System.out.println("Bike is ringing Bell....");
  }

    public boolean isHasBasket() {
        return hasBasket;
    }

    public void setHasBasket(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }
}

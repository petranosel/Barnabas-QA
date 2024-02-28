package Ageregation;



public class Epm {
    int id;
    String name;
    Addres addres;
    public Epm(int id,String name,Addres addres){
        this.id=id;
        this.name=name;
        this.addres=addres;
    }
void print(){
    System.out.println( id+" " + name);
    System.out.println("Address:"+  addres.street+"  "+ addres.city+" "+addres.state+ "  " + addres.zip);

    }





}


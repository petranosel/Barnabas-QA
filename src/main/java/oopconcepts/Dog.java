package oopconcepts;

public class Dog extends Animal {

    protected String Breed;
    public Dog(String breed,String name){
        super(name);
        this.Breed= breed;

    }
public void PrintDetails(){
    System.out.println(Breed+" "+ name+ "is a dog");
}




}

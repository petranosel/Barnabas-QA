package oopconcepts;

public class Inheritance {
    public static void main(String[] args) {

        Dog dog = new Dog("Doberman","Tommy");
        Cat cat = new Cat("Lucy","persian");
    dog.PrintDetails();//child class
    dog.eat();//parent class

        System.out.println("==============");
        cat.printCat();
        cat.eat();



    }


    }

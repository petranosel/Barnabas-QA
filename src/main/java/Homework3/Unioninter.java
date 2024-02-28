package Homework3;

import java.util.HashSet;
import java.util.Set;

public class Unioninter {
    public static void main(String[] args) {
       IntersectionAndUnion();
        System.out.println("==============");
       Operationsset();
    }
    public static void  IntersectionAndUnion(){
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("a");
        set1.add("b");
        set1.add("c");

        set2.add("b");
        set2.add("c");
        set2.add("d");

        // Find intersection
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // Find union
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Intersection: " + intersection);
        System.out.println("Union: " + union);




}

public static void Operationsset(){


    Set<Integer> mySet = new HashSet<>();


    mySet.add(1);
    mySet.add(2);
    mySet.add(3);

    // Display the set
    System.out.println("Set elements: " + mySet);


    int elementToCheck = 2;
    if (mySet.contains(elementToCheck)) {
        System.out.println(elementToCheck + " is present in the set.");
    } else {
        System.out.println(elementToCheck + " is not present in the set.");
    }

    // Removing an element
    int elementToRemove = 3;
    if (mySet.contains(elementToRemove)) {
        mySet.remove(elementToRemove);
        System.out.println(elementToRemove + " removed from the set.");
    } else {
        System.out.println(elementToRemove + " is not present in the set. Nothing to remove.");
    }

    // Display the updated set
    System.out.println("Updated set: " + mySet);



}








}

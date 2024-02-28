package Homework3;

import java.util.*;

public class Setex1 {
    public static void main(String[] args) {

        Array1();
        System.out.println("=====");
        LinkedList1();
        System.out.println("=====");
        LinkedList3();
        System.out.println("=====");
        Sorting();
        System.out.println("=====");
        Set4();
        System.out.println("=====");
        Duplicates1();

    }


    public static void Array1() {
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        num1.add(1);
        num1.add(5);
        num1.add(3);
        Iterator<Integer> itr = num1.iterator();
        while (itr.hasNext()) {

            System.out.println("First element: " + num1.get(0) + " " + "Second element: " + num1.get(1));
            System.out.println(itr.next());
        }


        System.out.println("Result:" + num1);
        }


    public static void LinkedList1() {
        LinkedList<Integer> num2 = new LinkedList<Integer>();
        num2.add(5);
        num2.add(3);
        num2.add(6);
        System.out.println("linked result:" + num2);

        num2.add(4);
        num2.add(7);
        System.out.println(" adding" + num2);

    }

    public static void LinkedList3() {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Gahana");
        linkedList.add("USA");
        linkedList.add("Mexico");
        linkedList.add("China");
        Iterator itr = linkedList.iterator();

        System.out.println("Result nations:" + linkedList);
        //replace "China" with "Japan"
        String searchElement = "China";
        String replacementElement = "Japan";
        if (linkedList.contains(searchElement)) {
            int index = linkedList.indexOf(searchElement);
            linkedList.set(index, replacementElement);
            System.out.println("After replacement: " + linkedList);


        }
    }

    public static void Sorting() {
        List<Integer> num3 = new ArrayList<>();

        num3.add(3);
        num3.add(1);
        num3.add(5);
        num3.add(2);
        num3.add(4);


        {
            System.out.println("Original List: " + num3);
        }

        Collections.sort(num3);
        {
            System.out.println("Ascending Order: " + num3);
        }

        Collections.sort(num3, Collections.reverseOrder());
        {
            System.out.println("Descending Order: " + num3);
        }

    }

    public static void Set4() {
        List<String> Carss = new ArrayList<>();
        Carss.add("Bmw");
        Carss.add("Honda");
        Carss.add("Nissan");
        Carss.add("Camry");

        System.out.println("Loop:");
        for (String car : Carss) {
            System.out.println(car);
        }

        System.out.println("Iterators:");
        Iterator<String> iterator = Carss.iterator();
        while (iterator.hasNext()) {
            String cars = iterator.next();
            System.out.println(cars);


        }
    }

    public static void Duplicates1() {
        String[] str = {"Red", "brown", "Yellow", "blue", "Yellow", "Red", "blue", "Black", "blue", "Red", "Black", "White"};
        HashSet<String> setx = new HashSet<>();
        for (String s : str) {
            setx.add(s);
        }

        // Convert the set back to an array
        String[] resultArray = setx.toArray(new String[0]);

        for (String s : resultArray) {
            System.out.print(s + " ");


}}


}































































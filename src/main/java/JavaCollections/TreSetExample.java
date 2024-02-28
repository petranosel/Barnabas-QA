package JavaCollections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreSetExample {
    public static void main(String[] args) {
  TreSetExample();
    }
public static void  TreSetExample(){
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(5);
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(9);

    System.out.println(" tree set in ascending order");
    for ( Integer e : treeSet){
        System.out.println(e);
    }


    }






}

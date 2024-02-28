package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set {
    public static void main(String[] args) {
        hashSet();
        LinkedHashset();


    }

    public static void hashSet() {
        HashSet<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("a");
        set.add("b");
        set.add("c");
        //set.remove(a:"
        System.out.println(set.hashCode());
        Object s = set.clone();
        System.out.println(set.isEmpty());
        System.out.println(set.size());

        String[] s1 = set.toArray(new String[0]);
        for (String e : s1) {
            System.out.println(e + " ");
        }
    }


    // Iterator<String> iter = set.iterator();
   // while (iter.hasNext()){
     //  System.out.println(iter.next());


    public static void LinkedHashset() {

    }

    {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add(" Amber");
        set.add(" joe");
        set.add( null);
        set.add(" john");
        set.add(" aj");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }}


















package JavaCollections;

import java.util.Arrays;
import java.util.HashSet;

public class Homework {
    public static void main(String[] args) {
        String[] str = {"a", "b", "c", "d", "e", "f", "g", "a", "b", "c", "h", "i", "j", "k", "l", "m"};


        HashSet<String> set = new HashSet<>();
        for (String s : str) {
            set.add(s);
        }


        String[] resultArray = set.toArray(new String[0]);


        for (String s : resultArray) {
            System.out.print(s + " ");}
    }









}


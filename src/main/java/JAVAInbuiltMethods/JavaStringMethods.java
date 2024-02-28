package JAVAInbuiltMethods;

import java.util.Locale;

public class JavaStringMethods {
    public static void main(String[] args) {
        String s ="hello";
        //getting the  length

        int length= s.length();
        System.out.println("getting the length of the string:"+length );

        //getting index
        char ch = s.charAt(0);
        System.out.println("char at o index:"+ch);
        //splitting
        String substring= s.substring(2,4);
        System.out.println("spliting the string and getting value:" + substring);
        //adding another string
        String str  = "Hello world";
        String concat= s.concat(str);
        System.out.println("New string:" + concat);
        // matching to strings
        String  str1= "Hello";
        boolean isEqual =str1.equals(s);
        System.out.println("matching the string:"+ isEqual);
        //matching two stiring ignoring the case
        boolean isEqualIgnoreCase= str1.equalsIgnoreCase(s);
        System.out.println("match with out case:"+ isEqualIgnoreCase);
// lower case
        String lower ="    hello world";
        String upper = "Hello World";
        System.out.println(lower.toUpperCase());
        System.out.println(upper.toLowerCase());
        System.out.println(lower.trim());







    }






}

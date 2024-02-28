package org.Automation_002;

import java.util.Scanner;

public class challege1 {
    public static void main(String[] args) {
        String H = "Happy";
        int n = 4;

        String result = H.repeat(n);
        System.out.println(result);
    }
public static String StringTimes(String str,int n){
        String result = "";
        for(int i=0 ;i<str.length();i++){
            result=result + str;
        }
    System.out.println( result);
   return  result;

}

public  static  boolean IsSequence(int[] numbers){
        for (int i=0;i<numbers.length-2;i++){
            if (numbers[1] ==1 & numbers[i+2]==2  && numbers[i+2]==3){

            }
        }
    return false;
}

public static String alternatives(String string) {
    String result = "";
    for (int i = 0; i < string.length(); i += 4) {
        int end = i + 2;
        if (end > string.length()) {
            end = string.length();
        }
        result = result + string.substring(i, end);
    }
    return result;


}



public static  String frontTimes(String str,int n){
        int frontLen=3;
                if(frontLen>str.length()){
                    frontLen = str.length();
                }

        String front = str.substring(0,frontLen);
       String result ="";
       for(int i=0;i< n;i++){
           result =result + front;
       }




    return front;
}


public String stringx( String str){
        String result ="";
        for (int i =0; i<str.length();i++){
            if (!(i>0 && i < str.length()-1) && str.substring(i,i+1).equals("x")) {
             result = result + str.substring(i,i+1);
            }
        }
return result;






    }











}




























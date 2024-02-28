package org.Automation_002;

public class methodsExplaininjava {

    public static void method1() {
        int a = 100;
        int b = 100;
        System.out.println(a + b);


    }

    public static void method2(int a, int b) {
        System.out.println(a + b);

    }

    //method with return
    public static int method3(int a, int b) {
        System.out.println(a*b);
        return a * b;
    }

    public static long method4(){
        long a = 140;
        long b = 145;
        System.out.println(a + b);
        return a + b;

    }

    public static long method5(int a, long b) {
        System.out.println(a + b);
        return a + b;
    }
//Given to integer values return their sum unless the two values are the same the return double thier are some


    public static double method6(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum * 2;}

        System.out.println(sum);

            return sum;

                }
        //  given 2 positive integer values return the larger value that is in the range 10 to 20 inclusive or return 0
        //  if neither is that range


public int max1020(int a,int b){
            if(b>a){
                int c=a;
                a=b;
                b=c;
            }
        if (a>=10 && a <=20)
            return a;
        if(a>=10 && b<=20)
            return b;

        else{
            return 0;
        }

    }

    public  static void temprature(float a,float b){
        System.out.println(a < 0 || b < 0 && a > 100 || b > 100);

    }

public static boolean isTeen(int a,int b) {
    boolean isaTeen = a >= 13 && a <= 19;
    boolean isbTeen = a >= 13 && b <= 19;
    if (isaTeen && !isbTeen) {
        System.out.println(true);
        return true;
    } else if (!isaTeen && isbTeen) {
        System.out.println(true);
        return true;
    } else {
        System.out.println(false);


        return false;
    }
}

 public static boolean sum10(int a,int b) {
     if (a == 10 || b == 10) {
         System.out.println(true);
         return true;
     } else if (a + b == 10) {
         System.out.println(true);
         return true;
     } else return false;


 
 }




public static boolean mod35(int a) {
    if (a % 3 == 0 || a % 5 == 0) {
        System.out.println(true);
    } else {
        System.out.println(false);
        return false;

    }
    return false;
}
  public static boolean sameLast(int a,int b) {
      if ((a % 10 == 7) && (b % 10 == 7)) {
          System.out.println(true);
          return true;
      } else {
          System.out.println(false);
          return false;}

  }
}






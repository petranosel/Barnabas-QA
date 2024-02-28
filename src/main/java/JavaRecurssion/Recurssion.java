package JavaRecurssion;

public class Recurssion {
//   static  int count = 0;
    //    static void r () {
//        count++;
//        if (count <= 5) {
//            System.out.println("hello " + count);
//            r();
//        }
//
//    }
////   static void  p(){
////       System.out.println(" hello barnabas");
////       p();
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            System.out.println(" factorial" +n * factorial(n));
        }
        return (n * factorial(n-1));


    }}



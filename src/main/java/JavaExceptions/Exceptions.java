package JavaExceptions;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int num = 100/0;
        } catch ( ArithmeticException e){
            System.out.println( e.getMessage());
        }finally {
            int num2 =100/2;
            System.out.println(num2);
        }

// int a = 100/0;
//        System.out.println(a);
//        int b= 100/2;
//        System.out.println(b);

String s= null;
        System.out.println(s);
        try {String str= null;
            System.out.println( str);
        }catch ( NullPointerException e){
            System.out.println(e.getMessage());
        }finally {
            String str = "hello";
            System.out.println(str);
        }
// array index out of bounds
      try {


        int[] arr ={1,2,3,4,5,6};
        System.out.println(arr[7]);

    }catch (ArrayIndexOutOfBoundsException e){
          System.out.println(e.getMessage());
} finally {

          int[] arr = {1,2,3,4,5,6};
          System.out.println(arr[2]);
      }
      }}

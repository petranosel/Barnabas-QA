package Polymorphisim;

public class MethodeOverloading {
    public static void main(String[] args) {
  Ader.add(10,2);
  Ader.add(10,2,3);
       Ader.print("hello","Class") ;
       Ader.print("hello","class",'a');
    }

}
class Ader {
    static int add (int arg1,int arg2){
        System.out.println(arg1+arg2);
        return arg1+arg2;

    }

    static  int add( int arg1,int arg2, int arg3){

        System.out.println();
        return arg1+arg2+arg3;
    }
static String print (String s,String st){
    System.out.println(s+st);
    return s+st;

}
static String print(String s,String st, char ch){
    System.out.println( s+st+ch);
return s+st+ch;
    }



}






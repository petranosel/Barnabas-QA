package ExceptionHandlindig;

import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) {

        testThrow.validate(23);

    try{
        throw new UserDefinedException ("this user");} catch (UserDefinedException ude)
    {
        System.out.println(" caught exception");
        System.out.println(ude.getMessage());}

try{
    M m= new M();
    m.method();
} catch (Exception e){
    System.out.println( "Exception handled");}
    System.out.println( " Normal flow");


}}
 class testThrow{
    public  static void validate(int age){
        if (age<18){
            throw  new ArithmeticException(" person not eligible");
        }else {
            System.out.println("person eligible ");
    }
 }}
class UserDefinedException extends Exception {
    public  UserDefinedException   (String str){
        super(str );

    }}
class M{
    void method() throws IOException{
        throw new IOException(" Device Error");
    }
}
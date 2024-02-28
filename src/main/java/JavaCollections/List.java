package JavaCollections;

import java.util.*;

public class List {
    public static void main(String[] args) {
        ArrayListExample();
        LinkedListExample();
        VectorExample();
        StackExample();
    }



    public static void ArrayListExample() {
        ArrayList <String>list = new ArrayList<String>();
        list.add("barnabas");
        list.add("seun");
        list.add("mohi");

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }}


        public static void LinkedListExample(){
            LinkedList <String> list =new LinkedList<String>();

            list.add("barnabas");
            list.add("seun");
            list.add("mohi");
            list.add("harish");
            Iterator itr = list.iterator();
            while (itr.hasNext()){
                System.out.println(itr.next());


        }}
public static void VectorExample(){
    Vector<String> V = new Vector<String>();
    V.add("hello");
    V.add("world");
    V.add("this");
    V.add("is");
    V.add("java");
    Iterator< String> itr = V.iterator();
    while ( (itr.hasNext())){
        System.out.println(itr.next());}}


public static void StackExample(){
    Stack<String> stack= new Stack<String>();
    stack.push("hello");
    stack.push("World this java world");

    Iterator<String> itr = stack.iterator();
    while (itr.hasNext()){
        System.out.println(itr.next());

}







    }}

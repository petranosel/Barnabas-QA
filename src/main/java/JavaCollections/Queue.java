package JavaCollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue();

        Deque();
    }
public static  void  PriorityQueue(){
        PriorityQueue<String> queue =new PriorityQueue<String>();
        queue.add("Barnabas");
        queue.add("Seun");
        queue.add("harish");
    System.out.println("head "+ queue.peek());
    System.out.println( "head" + queue.element());

    // iterator
    Iterator itr = queue.iterator();
    while (itr.hasNext()){
        System.out.println(itr.next());

    }
  queue.remove();
    queue.poll();
    System.out.println( " after removing two elements");
    Iterator<String> itr1 = queue.iterator();
    while (itr1.hasNext()){
        System.out.println(itr1.next());
    }



}

public static  void Deque (){
        Deque<String> deque =new ArrayDeque<String>();
        deque.add("harish");
        deque.add("Seun");
        deque.add("Barnabas");
        for ( String str: deque){
        System.out.println(str);
    }
}

 public  static  void ArrayDeque(){
        Deque<String> deque =new ArrayDeque<String>();
        deque.add("harish");
        deque.add("Barnabas");
        deque.add("seun");
  for (String str: deque){
      System.out.println(str);
  }

    }

}

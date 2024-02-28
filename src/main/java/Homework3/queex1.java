package Homework3;

import java.util.LinkedList;
import java.util.Queue;

public class queex1 {
   private Queue<String> queue;

     public queex1() {
        this.queue = new LinkedList<>();


}

public void enqueue( String customer){
    queue.offer(customer);
    System.out.println(customer + " has joined the queue.");
}

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No customers to dequeue.");
            return null;
        }

        String customer = queue.poll();
        System.out.println(customer + " has been served and dequeued.");
        return customer;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        queex1 customerQueue = new queex1();

        customerQueue.enqueue("Customer1");
        customerQueue.enqueue("Customer2");
        customerQueue.enqueue("Customer3");

        System.out.println("Queue size: " + customerQueue.size());

        customerQueue.dequeue();
        customerQueue.dequeue();
        customerQueue.dequeue();

        System.out.println("Queue size: " + customerQueue.size());
    }}
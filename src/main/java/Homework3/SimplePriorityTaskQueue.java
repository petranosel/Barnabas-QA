package Homework3;
import java.util.PriorityQueue;
public class SimplePriorityTaskQueue {
    public void main(String[] args) {
        PriorityQueue<Task> priorityQueue = new PriorityQueue<>();

        // Adding tasks to the priority queue
        priorityQueue.offer(new Task("Task1", 3));
        priorityQueue.offer(new Task("Task2", 1));
        priorityQueue.offer(new Task("Task3", 2));

        // Processing tasks based on priority
        while (!priorityQueue.isEmpty()) {
            Task currentTask = priorityQueue.poll();
            System.out.println("Processing task: " + currentTask);
        }
    }

    class Task implements Comparable<Task> {
        private String name;
        private int priority;

        public Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public int compareTo(Task other) {
            // Tasks with higher priority should come first
            return Integer.compare(other.priority, this.priority);
        }

        @Override
        public String toString() { return "Task{" +"name='" + name + '\'' +", priority=" + priority +'}';
        }











}}


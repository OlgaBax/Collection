package ru.bainc.main.collection.queue_interface;
import java.util.PriorityQueue;

public class PrioriryQueueEx2 {
    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        Student student1 = new Student("Zaur", 3);
        Student student2 = new Student("Mariya",  1);
        Student student3 = new Student("Sergey",  4);
        Student student4 = new Student("Igor", 5);
        priorityQueue.add(student1);
        priorityQueue.add(student2);
        priorityQueue.add(student3);
        priorityQueue.add(student4);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}

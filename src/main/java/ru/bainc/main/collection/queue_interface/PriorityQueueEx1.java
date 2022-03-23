package ru.bainc.main.collection.queue_interface;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
        System.out.println(priorityQueue); //когда выводим на экран никакой сортировки нет.
        System.out.println(priorityQueue.peek());// сортировка появляется после использования элементов
        System.out.println(priorityQueue.remove());


    }
}

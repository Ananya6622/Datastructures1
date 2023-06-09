package com.ll;

import java.util.LinkedList;

public class QueueDemo {
    private LinkedList<Integer> queue;

    public QueueDemo() {
        queue = new LinkedList<>();
    }

    public void enqueue(int data) {
        queue.addLast(data);
    }

    public int dequeue() {
        if (queue.size() == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue.removeFirst();

    }

    public int peek() {
        if (queue.size() == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue.getFirst();
    }

    public void printQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.get(i));
            if (i != queue.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueDemo queue = new QueueDemo();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.printQueue();

        while (queue.peek() != -1) {
            System.out.println("Dequeue: " + queue.dequeue());
        }
    }
}


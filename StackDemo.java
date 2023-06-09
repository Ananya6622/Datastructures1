package com.ll;

import java.util.LinkedList;

public class StackDemo {
    private LinkedList<Integer> stack;

    public StackDemo() {
        stack = new LinkedList<>();
    }

    public void push(int data) {
        stack.addFirst(data);
    }

    public int pop() {
        if (stack.size() == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.removeFirst();
    }

    public int peek() {
        if (stack.size() == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.getFirst();
    }

    public void printStack() {
        System.out.print("Stack: ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i));
            if (i != stack.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackDemo stack = new StackDemo();

        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.printStack();

        while (stack.peek() != -1) {
            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
        }
    }
}

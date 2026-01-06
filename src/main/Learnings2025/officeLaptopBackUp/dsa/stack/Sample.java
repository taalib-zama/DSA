package dsa.stack;

import java.util.Stack;

public class Sample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        stack.pop();
        System.out.println("Stack after one pop : "  + stack);
        System.out.println("Top element is: " + stack.peek());


        System.out.println("Is stack empty? " + stack.isEmpty());

    }
}

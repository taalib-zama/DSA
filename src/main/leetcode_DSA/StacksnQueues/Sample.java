package StacksnQueues;

import java.util.Stack;

public class Sample {
    public static void main(String[] args) {
        // Declaration: Java supports multiple implementations, but we will be using
// the Stack interface with the Stack implementation. Specify the data type
        Stack<Integer> stack = new Stack<>();

// Pushing elements:
        stack.push(1);
        stack.push(2);
        stack.push(3);

/*// Popping elements:
        stack.pop(); // 3
        stack.pop(); // 2

// Check if empty
        stack.empty(); // false

// Check element at top
        stack.peek(); // 1*/

// Get size
        stack.size(); // 1*/
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(5);

        if (stack.empty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println(String.format("Stack is not empty, top is: %d", stack.peek()));
        }
    }
}

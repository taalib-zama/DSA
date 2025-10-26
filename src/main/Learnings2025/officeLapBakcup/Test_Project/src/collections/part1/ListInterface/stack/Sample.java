package collections.part1.ListInterface.stack;

import java.util.Stack;

public class Sample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        System.out.println("Stack after pushing elements: " + stack);
        // Pop an element from the stack
        System.out.println("Popped element: " + stack.pop());

        //time complexity -
        // insertion - O(1)
        // search - O(n)
    }
}

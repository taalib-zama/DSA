package collections.stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a new stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        //viewing top element of stack.
        System.out.println("top element in stack" +stack.peek());


        //printing element of stack (default order - order of LIFO not maintained)
        System.out.println("Printing out element of stack");
        Iterator<Integer> it = stack.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }


        //iterating in reverse order.
        System.out.println("iterating in reverse order");
        ListIterator<Integer> liter = stack.listIterator();
        while(liter.hasPrevious()) {
            System.out.println(liter.previous());
        }

        // Pop elements from the stack
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
        }

package JavaBasic;

public class StackVsHeap {
    public static void main(String[] args) {
        // Stack example
        int a = 10; // Primitive type stored on the stack
        int b = 20; // Primitive type stored on the stack
        int sum = a + b; // sum is also stored on the stack

        System.out.println("Stack Example:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("sum: " + sum);

        // Heap example
        String str1 = new String("Hello"); // Object stored on the heap
        String str2 = new String("World"); // Object stored on the heap

        System.out.println("\nHeap Example:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}

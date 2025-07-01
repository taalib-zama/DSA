package funtionalInterface.typesOfFI.Predicate;

public class Main {
    public static void main(String[] args) {
        // Predicate is a functional interface that takes an input and returns a boolean value
        // It is used to evaluate a condition on the input

        // Example usage of Predicate
        java.util.function.Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(5)); // false
    }
}

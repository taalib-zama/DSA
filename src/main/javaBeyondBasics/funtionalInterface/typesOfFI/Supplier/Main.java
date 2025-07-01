package funtionalInterface.typesOfFI.Supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

    // Using a Supplier to provide a default value
    java.util.function.Supplier<String> stringSupplier = () -> "Default Value";
        System.out.println(stringSupplier.get()); // Output: Default Value

    // Using a Supplier to generate a random number
    java.util.function.Supplier<Double> randomNumberSupplier = () -> Math.random();
        System.out.println(randomNumberSupplier.get()); // Output: Random number

    // Using a Supplier to create an object
    Supplier<StringBuilder> objectSupplier = StringBuilder::new;
    StringBuilder sb = objectSupplier.get();
        sb.append("Hello, Supplier!");
        System.out.println(sb.toString()); // Output: Hello, Supplier!


        funtionalInterface.typesOfFI.Supplier.Supplier supplierObj = () -> "Returning the default value from custom Supplier interface";
        System.out.println(supplierObj.get()); // Output: Returning the default value from custom Supplier interface
}
}

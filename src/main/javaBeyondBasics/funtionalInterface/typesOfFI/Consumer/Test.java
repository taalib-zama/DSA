package funtionalInterface.typesOfFI.Consumer;

public class Test {
    public static void main(String[] args) {
        Consumer<Object> consumer = (s) -> {
            System.out.println("Logging Consumer accepts: " + s);
        };

        consumer.accept("Hello, World!");
        consumer.accept(12345);
        //here using object is feasible as we are using one way consumption of data.


        //optional
        // Using a method reference
        Consumer<String> methodRefConsumer = System.out::println;
        methodRefConsumer.accept("Using method reference in Consumer");
    }
}

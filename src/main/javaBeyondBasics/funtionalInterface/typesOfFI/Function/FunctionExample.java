package funtionalInterface.typesOfFI.Function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println(lengthFunction.apply("Hello")); // 5
    }
}

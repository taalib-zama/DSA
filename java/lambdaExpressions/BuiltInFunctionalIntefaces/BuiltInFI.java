package lambdaExpressions.BuiltInFunctionalIntefaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class BuiltInFI {
    public static void main(String[] args) {
        //Obtaining Cube of a Number Using Function<T1,T2>
        Function<Integer, Integer> getCube = (value) -> value * value * value;
        Integer resultCube = getCube.apply(6);
        System.out.println(resultCube);

        //using predicate function to check age.
        Predicate<Integer> checkAge = (age) -> age > 18;
        System.out.println(checkAge.test(19));

        //Checking whether Experience is greater than 4 and Role is "Manager" Using BiPredicate<T1,T2>
        BiPredicate<Integer, String> checkExpRole = (exp, role) -> exp > 4 && role == "Manager";
        System.out.println(checkExpRole.test(5, "Manager"));

        //Consuming/Processing a List and Displaying its Square Using Consumer<T>
        Consumer<Integer> consumer = (value) -> System.out.println(value);
        List<Integer> randList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for (Integer i : randList)
            consumer.accept(i * i);

        //Supply 5 Random Double Values Using Supplier<T>
        Supplier<Double> generateRandom = () -> Math.random() * 100;
        for (int i = 0; i < 5; i++)
            System.out.println(generateRandom.get());

        //Checking whether age is greater than 18 and Returning Custom String Using Function<T1,T2>
        Function<Integer, String> funcCheckAge = (var age) -> age > 18 ? "Ok" : "Not Ok";
        String result = funcCheckAge.apply(21);
        System.out.println("Is Age Ok/Not Okay: " + result);

        //The parameter age is declared using var in the above code
        //Its type will be thus inferred as Integer since the generic type is set to Function<Integer, String>
    }
}

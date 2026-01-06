package backlog.Java8.functionalInterface.function;

import java.util.function.Function;

public class apply {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleNumber;
            /*@Override
            public Integer apply(Integer t) {
                return t * 2;
            }*/
            //replace override with lambda.
            doubleNumber = t -> t * 2;
        System.out.println(doubleNumber.apply(2));
    }
}

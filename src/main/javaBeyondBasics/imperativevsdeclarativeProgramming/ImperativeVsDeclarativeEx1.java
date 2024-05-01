package imperativevsdeclarativeProgramming;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeEx1 {
    public static void main(String[] args) {
        //use case - perform summation of first 100 numbers in 0-100.

        //using imperative style.
        int sum = 0;
        for(int i = 0; i <= 100 ; i++){
            sum +=i;
        }
        System.out.println("Sum using imperative apprach : "+sum);


        //using declarative style.
        //this is WHAT style of programming meaning we ask for what we want but we don't care about how result s provided to you.
        //make use of functions that are added as part of functional programming
        int sum1 = IntStream.rangeClosed(0,100).sum();
        System.out.println("using declarative approach " +sum1);

    }

}

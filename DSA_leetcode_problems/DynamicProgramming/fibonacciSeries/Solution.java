package DynamicProgramming.fibonacciSeries;

public class Solution {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else {
            var prevFib = 0;
            var currFib = 1;
            for (int i = 0; i < n-1; i++) {
                var newFib = prevFib + currFib;
                prevFib = currFib;
                currFib = newFib;

            }
            return currFib;
        }
    }
}


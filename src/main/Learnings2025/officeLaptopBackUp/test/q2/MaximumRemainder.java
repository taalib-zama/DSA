package test.q2;

import java.util.Optional;
import java.util.Arrays;
import java.util.OptionalInt;

public class MaximumRemainder {
    public static int findMaximumRemainder(int N, int[] A, int k) {
        int maxOdd = Integer.MIN_VALUE;
        int maxEven = Integer.MIN_VALUE;

        // Identify the maximum odd and even numbers
        for (int num : A) {
            if (num % 2 == 0) {
                maxEven = Math.max(maxEven, num);
            } else {
                maxOdd = Math.max(maxOdd, num);
            }
        }

        // Calculate the maximum remainder
        return (maxOdd + maxEven) % k;
    }


    //The problem can be optimized further by finding the two largest odd numbers and
    // the two largest even numbers in a single pass through the array.
    // This ensures that we only calculate the maximum remainder using the largest
    // possible sums, reducing unnecessary computations.

    public static int find_maximum_remainder(int N,int[] A,int k){
            int maxOdd1 = Integer.MIN_VALUE, maxOdd2 = Integer.MIN_VALUE;
            int maxEven1 = Integer.MIN_VALUE, maxEven2 = Integer.MIN_VALUE;

            // Find the two largest odd and even numbers
            for (int num : A) {
                if (num % 2 == 0) {
                    if (num > maxEven1) {
                        maxEven2 = maxEven1;
                        maxEven1 = num;
                    } else if (num > maxEven2) {
                        maxEven2 = num;
                    }
                } else {
                    if (num > maxOdd1) {
                        maxOdd2 = maxOdd1;
                        maxOdd1 = num;
                    } else if (num > maxOdd2) {
                        maxOdd2 = num;
                    }
                }
            }

            // Calculate maximum remainder
            int maxRemainder = 0;
            if (maxOdd1 != Integer.MIN_VALUE && maxEven1 != Integer.MIN_VALUE) {
                maxRemainder = Math.max(maxRemainder, (maxOdd1 + maxEven1) % k);
            }
            if (maxOdd1 != Integer.MIN_VALUE && maxEven2 != Integer.MIN_VALUE) {
                maxRemainder = Math.max(maxRemainder, (maxOdd1 + maxEven2) % k);
            }
            if (maxOdd2 != Integer.MIN_VALUE && maxEven1 != Integer.MIN_VALUE) {
                maxRemainder = Math.max(maxRemainder, (maxOdd2 + maxEven1) % k);
            }

            return maxRemainder;

    }


    public static int find_maximum_remainderUsingStream(int N,int[] A,int k) {
        // find max odd.
        OptionalInt maxOdd =  Arrays.stream(A)
                .filter(num -> num % 2 != 0)
                .max();
        //max even
        OptionalInt maxEven =  Arrays.stream(A)
                .filter(num -> num % 2 == 0)
                .max();

        // Calculate the maximum remainder
        if (maxOdd.isPresent() && maxEven.isPresent()) {
            return (maxOdd.getAsInt() + maxEven.getAsInt()) % k;
        }

        // If no valid odd or even numbers are found, return 0
        return 0;
    }

    public static void main(String[] args) {
        int N = 6;
        int[] A = {1, 2, 3, 4, 5, 6};
        int k = 4;

        int result = find_maximum_remainderUsingStream(N, A, k);
        System.out.println("Maximum Remainder: " + result); // Output: 3
    }
}
package netcore.Netcore.Q1.solution;

import inheritence.StaticDemo;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static int solve(String SN, String SK, int L, int R) {
        //edge cases :
        if (R < L || SK.length() < L) {
            return -1;
        }
        //approach :
        //Convert SN to binary array with elements existing in Sk as 1.
        //2 pointer to count the max no of valid spl chars. L is 3 and R is 4.
        //	1. 110 - 2 spl - it is not between L and R - count +0
        //	2. 1101 - 3 "     it is between L and R - count +1
        //	3. 11011 - 4 "   " "
        //	4. 110110 - 4 valid
        //	5. End of index - start moving from beginning.
        //	6. 10110 -valid.
        //	7. 0110 - invlid.

        //Total count = result

        //NOTE : String.indexOf(char c) is a safe built-in method in Java and check first occurence of char c in String.
        int[] binary = new int[SN.length()];

        for (int i = 0; i < SN.length(); i++) {
            char c = SN.charAt(i);
            // Check if character exists in S(K)
            if (SK.indexOf(c) != -1) {
                binary[i] = 1;
            } else {
                binary[i] = 0;
            }
        }

        //use sliding window using 2 pointer to count valid spl setups.
        int n = binary.length;
        int count = 0;

        for (int left = 0; left < n; left++) {
            int onesCount = 0;

            for (int right = left; right < n; right++) {
                if (binary[right] == 1) {
                    onesCount++;
                }

                // Check if window is valid
                if (onesCount >= L && onesCount <= R) {
                    count++;
                } else if (onesCount > R) {
                    // Exceeded upper bound, break inner loop
                    break;
                }
            }
        }

        return count;
    }


    public static int solveUsingStream(String SN, String SK, int L, int R) {
        if (R < L || SK.length() < L) return -1;

        Set<Character> specialChars = SK.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());

        return IntStream.range(0, SN.length())
                .map(left -> IntStream.range(left, SN.length())
                        .map(right -> (int) SN.substring(left, right + 1).chars()
                                .filter(c -> specialChars.contains((char) c))
                                .count())
                        .takeWhile(count -> count <= R)
                        .map(count -> count >= L && count <= R ? 1 : 0)
                        .sum())
                .sum();
    }


    public static void main(String[] args) {
        int  N = 5, K = 3, L = 3, R = 4;
        String SN  = "AbcAbZDeF"; //n shoes.
        String SK  = "AbZ"; //spl shoes.

        //edge case :
        // if R >= K >= L)
        // for L > K - not possible.
        // hence, if L < R, K >= L ---return -1

        System.out.print("Output :  " + solve(SN, SK, L, R));
    }

}

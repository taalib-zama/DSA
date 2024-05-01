package Assesments.codingQuestions;

public class Solution {

    private static int storedValue = 0;
    public static int equationSum(int n)
    {
        //Your code here
        storedValue = storedValue + ((2*n) + ((n*n)+1+ (2*(n*n))) - ((n * n) + 4));
        return (storedValue);

    }
}

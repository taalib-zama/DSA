package strings.interviewQuestions.removeduplicatedfromintegerarray;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int[][] test = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},};

        for(int[] input : test) {
            System.out.println("Array before filtering : " + Arrays.toString(input));
            System.out.println("Array after filtering : " + Arrays.toString(Solution.removeDuplicates(input)));
        }
    }
}

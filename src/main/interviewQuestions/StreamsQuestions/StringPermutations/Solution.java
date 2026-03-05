package StreamsQuestions.StringPermutations;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String str = "abc";
        //permutations  - abc, acb, bac, bca, cab, cba
        // find all the permutations and store in a list.
            List<String> result = findPermutations(str);
            System.out.println(result);
    }

    private static List<String> findPermutations(String str) {
        // base case
        if (str.length() == 1) {
            return List.of(str);
        }
        // recursive case
        char firstChar = str.charAt(0);
        String remainingChars = str.substring(1);

        List<String> permutationsOfRemaining = findPermutations(remainingChars);
        List<String> allPermutations = new java.util.ArrayList<>();

        for (String permutation : permutationsOfRemaining) {
            for (int i = 0; i <= permutation.length(); i++) {
                String newPermutation = permutation.substring(0, i) + firstChar + permutation.substring(i);
                allPermutations.add(newPermutation);
            }
        }
        return allPermutations;
    }
}

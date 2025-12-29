package test.q3;


import java.util.Arrays;

public class Solve {
    private static final int MOD = 1_000_000_007;

    public static int countWays(String str, String pat) {
        // Count frequency of each character in pattern
        java.util.Map<Character, Integer> patCount = new java.util.HashMap<>();
        for (char c : pat.toCharArray()) {
            patCount.put(c, patCount.getOrDefault(c, 0) + 1);
        }

        // For each character in pattern, count occurrences in str
        java.util.Map<Character, Long> charOccurrences = new java.util.HashMap<>();
        for (char c : patCount.keySet()) {
            charOccurrences.put(c, 0L);
        }

        for (char c : str.toCharArray()) {
            if (charOccurrences.containsKey(c)) {
                charOccurrences.put(c, charOccurrences.get(c) + 1);
            }
        }

        // Check if all required characters exist
        for (char c : patCount.keySet()) {
            if (charOccurrences.get(c) == 0) {
                return 0;
            }
        }

        // Multiply counts for each character (combinatorial product)
        long result = 1;
        for (char c : patCount.keySet()) {
            result = (result * charOccurrences.get(c)) % MOD;
        }

        return (int)result;
    }

    public static int[] solve(int N, int M, String S, String R, int Q, int[] x, int[] y) {
        int[] result = new int[Q];
        for (int i = 0; i < Q; i++) {
            String sub = S.substring(x[i] - 1, y[i]);
            result[i] = countWays(sub, R);
        }
        return result;
    }
}

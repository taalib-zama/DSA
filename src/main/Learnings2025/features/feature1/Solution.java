package features.feature1;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static List<List<String>> groupTitles(String[] strs) {
        // Edge case
        if (strs.length == 0) return new ArrayList<>();

        return new ArrayList<>(Arrays.stream(strs)
                .collect(Collectors.groupingBy(Solution::computeKey))
                .values());
    }

    private static String computeKey(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        StringBuilder key = new StringBuilder();
        for (int i : count) {
            key.append('#').append(i);
        }
        return key.toString();
    }

    public static void main(String[] args) {
        // Driver code
        String titles[] = {"duel", "dule", "speed", "spede", "deul", "cars"};

        List<List<String>> gt = groupTitles(titles);
        String query = "spede";

        // Searching for all titles
        gt.stream()
                .filter(g -> g.contains(query))
                .forEach(System.out::println);
    }
}
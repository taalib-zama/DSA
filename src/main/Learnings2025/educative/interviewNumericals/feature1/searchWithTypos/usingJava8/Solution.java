package educative.interviewNumericals.feature1.searchWithTypos.usingJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public static List<List<String>> groupTitles(String[] strs) {
        // Edge case
        if (strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> res = new HashMap<>();
        res =  Arrays.stream(strs)
                .collect(Collectors.groupingBy(Solution::computeKey));
        System.out.println("Map of grouped titles: " + res);
        return new ArrayList<>(res.values());
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
        String[] titles = {"duel", "dule", "speed", "spede", "deul", "cars"};

        List<List<String>> gt = groupTitles(titles);
        System.out.println("Grouped Titles: " + gt);
        String query = "spede";
        //System.out.println("ComputeKey sample for 'spede': " + computeKey("spede"));

        // Searching for all titles

        //we just find the group which contains the query title
        gt.stream()
                .filter(g -> g.contains(query))
                .forEach(System.out::println);
    }
}
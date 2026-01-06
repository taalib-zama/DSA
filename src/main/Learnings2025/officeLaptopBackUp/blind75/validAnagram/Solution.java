package blind75.validAnagram;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        return false;
    }


        public static boolean isAnagramUsingStreams(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            return s.chars().sorted().boxed().toList()
                    .equals(t.chars().sorted().boxed().toList());
        }
}

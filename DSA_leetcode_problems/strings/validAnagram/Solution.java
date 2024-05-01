package strings.validAnagram;

import java.util.HashMap;
import java.util.Set;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        // Check if length of both strings is same or not
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),
                        map.get(s.charAt(i)) + 1);
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }
        // Now loop over String b
        for (int i = 0; i < t.length(); i++) {
            // Check if current character already exists in
            // HashMap/map
            if (map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i),
                        map.get(t.charAt(i)) - 1);
            }
            else {
                return false;
            }
        }
        // Extract all keys of HashMap/map
        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        // Returning True as all keys are zero
        return true;
    }
}

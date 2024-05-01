package hashmaps.firstduplicatecharacter;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static char repeatedCharacter(String s) {
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (seen.contains(c)) {
                return c;
            }

            seen.add(c);
        }
        return ' ';
    }

}

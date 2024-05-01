package strings.lengthoflastword;

public class Solution {
    public static int lengthOfLastWord(String s) {
        String str = s.trim();
        int lastSpaceIndex = str.lastIndexOf(" ");
        String lastWord = str.substring(lastSpaceIndex+1);
        return lastWord.length();
    }
}

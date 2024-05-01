package strings.reverseWordsInAString;

public class Solution {
    public static String reverseWords(String s) {

        //trim the string to make it remove spaces.
        //using 2 pointer approach
        //pointer i and j point to a non-empty charcter at last element of string.
        //start moving i towareds left unitl we find an empty space.
        //stop and pick the substring between i and j., add it to new string builder
        //assign i = j.
        //again start moving i towards left util find a space.
        StringBuffer sb = new StringBuffer();
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                i--;
            } else {
                int j = i;
                while (i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                for (int k = i + 1; k <= j; k++) {
                    sb.append(s.charAt(k));
                }
            }
        }

        return sb.toString();


    }
}

package strings.reverseString.reverseCharArray;

public class Solution {
    public static void reverseString(char[] s) {
        int len = s.length;
        int left = 0;
        int right = s.length - 1;
        while(left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }

        //using 2 pointer appoach, put left at beginning of array and right at end. increment/decrement after
        //each step and only swap if left < right.
    }
}

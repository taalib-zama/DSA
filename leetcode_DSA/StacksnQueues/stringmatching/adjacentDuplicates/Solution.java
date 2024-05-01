package StacksnQueues.stringmatching.adjacentDuplicates;



import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Solution {
    public static String removeDuplicates(String s) {
        //return "/0";
        //iterate the string.
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (c == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        Iterator value = stack.iterator();
        //stack to string.
        StringBuilder sb = new StringBuilder();
        while (value.hasNext()) {
            sb.append(value.next());
        }
        sb.reverse();
        String str = sb.toString();
        return str;
    }
}

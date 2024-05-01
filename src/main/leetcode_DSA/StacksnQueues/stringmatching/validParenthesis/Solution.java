package StacksnQueues.stringmatching.validParenthesis;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean isValid(String s) {
        //iterate over the string and store the opening brackets in Stack.
        //Stack<Character> stack = new Stack<>();
        Map<Character, Character> matching = new HashMap<>();
        matching.put('(', ')');
        matching.put('[', ']');
        matching.put('{', '}');


        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                //check the most recent unclosed opening bracket.
                if (stack.isEmpty()) {
                    return false;
                }
                Character lastBracket = stack.pop();
                if(matching.get(lastBracket)!=c){
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();

    }
}

package backlog.datastructures.stacks.validparenthesis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        //Map of reference chars for the sake of matching.
        Map<Character, Character> matching = new HashMap<>();
        matching.put('(', ')');
        matching.put('[', ']');
        matching.put('{', '}');

        //iterate ove the string and append into the stack.
        Stack<Character> test  = new Stack<>();
        

        return false;

    }
}

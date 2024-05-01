package strings.reverseString;

import java.util.Stack;

public class Solution {
    public static String reverseStringUsingStack(String str) {
        //initialize the stack.
        //The idea of stack is that we will be accessing only top element of a stack so it includes 2 steps as follows:
        //1. push all the characters in stack.
        //2. pop all the characters from stack and append to temp string.
        Stack<Character> tempStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            tempStack.push(str.charAt(i));
        }
        String result = "";
        while (!tempStack.isEmpty()) {
            result += tempStack.pop();
        }
        return result;
    }


    public static String inPlaceReverse(String str){
        //time complexity(o(n/2) - inly traverse the string halfway and then reverse in place from beginning
        //You can see, we are not creating new String objects, instead just swapping characters in StringBuilder.
        //A common mistake many Java programmer makes while using this algorithm is to traverse the whole String,
        // rather than stopping midway.
        //It's the same mistake, we have talked about while reversing ArrayList in place.
        // If you traverse the whole String, you switch each character twice, and they will return to their original position, leaving String the same as the original.
        final StringBuilder builder = new StringBuilder(str);
        int length = builder.length();
        for(int i = 0; i< length/2;i++){
            final char current = builder.charAt(i);
            final int otherEnd = length - i -1;
            builder.setCharAt(i, builder.charAt(otherEnd));
            builder.setCharAt(otherEnd,current);
        }
        return builder.toString();
    }
    public static String usingMethod(String str){
        StringBuilder input1 = new StringBuilder();
        // append a string into StringBuilder input1
        input1.append(str);
        // reverse StringBuilder input1
        input1.reverse();
        // print reversed String
        return input1.toString();
    }


}

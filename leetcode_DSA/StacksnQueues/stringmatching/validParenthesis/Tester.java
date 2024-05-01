package StacksnQueues.stringmatching.validParenthesis;

public class Tester {
    public static void main(String[] args) {
        String s1 = "}";
        String s2 = "[)";
        System.out.println(Solution.isValid(s1));
        System.out.println(Solution.isValid(s2));
    }
}

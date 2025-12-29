package blind75.validAnagram;

public class Tester {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(Solution.isAnagramUsingStreams(s, t));
    }
}

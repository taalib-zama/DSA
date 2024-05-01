package strings.validAnagram;

public class Tester {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        Boolean result = Solution.isAnagram(s,t);
        System.out.println(result);
    }
}

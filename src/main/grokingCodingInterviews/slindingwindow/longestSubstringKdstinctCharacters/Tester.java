package slindingwindow.longestSubstringKdstinctCharacters;

public class Tester {
    public static void main(String[] args) {
        String str1 = "araaci";
        System.out.println(Solution.findLongestLength(str1,2));

        String str2 = "araaci";
        System.out.println(Solution.findLongestLength(str2, 1));

        String str3 = "cbbebi";
        System.out.println(Solution.findLongestLength(str3, 3));
    }
}

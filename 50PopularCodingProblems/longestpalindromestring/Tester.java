package longestpalindromestring;

public class Tester {
    public static void main(String[] args) {
        String[] str = {"racecar", "abbaba", "abbabab", "abdccdceeebebc"};
        for (String s : str){
            System.out.println(solution.longestPalindrome(s));
        }
    }

}

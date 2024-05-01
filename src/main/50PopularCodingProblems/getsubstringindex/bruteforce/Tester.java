package getsubstringindex.bruteforce;

public class Tester {
    public static void main(String[] args) {
        String str1 = "aabbaaabab";
        String str2 = "aaba";
        int found = Solution.substringindex(str1 ,str2);
        System.out.println(found);
    }
}

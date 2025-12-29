package backlog.datastructures.palindromestring;

public class Tester {
    public static void main(String[] args) {
        String str = "madam";
        if (isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");

    }



    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) return true; // Base case
        if (str.charAt(0) != str.charAt(str.length() - 1)) return false;
        return isPalindrome(str.substring(1, str.length() - 1)); // Recur
    }


}

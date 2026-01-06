package backlog.string;

public class sample {

        public static void main(String[] args) {
            System.out.println(solve(8));
        }

        public static String solve(int N) {
            // Start from the smallest N digit number and go upto the largest N digit number
            int start = (int) Math.pow(10, N - 1);
            int end = (int) Math.pow(10, N) - 1;

            // Generate all numbers in this range
            for (int num = start; num <= end; num++) {
                // Check if the number is a palindrome
                if (isPalindrome(num)) {
                    // Check if the number is divisible by 7
                    if (num % 7 == 0) {
                        return Integer.toString(num);
                    }
                }
            }

            return "-1";  // Return "-1" if no such number is found
        }

        public static boolean isPalindrome(int num) {
            int reversed = 0, remainder, original = num;
            while (num != 0) {
                remainder = num % 10;
                reversed = reversed * 10 + remainder;
                num /= 10;
            }
            return original == reversed;
        }

}

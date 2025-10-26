package backlog.test5;
import java.util.Scanner;
public class Ship {


        public static void main(String[] args) {
            int X = 11;
            int Y = 33;
            int totalSaved = 0;

            for (int i = X; i <= Y; i++) {
                if (isGoldenPrice(i)) {
                    totalSaved += i;
                }
            }

            System.out.println(totalSaved);
        }

        private static boolean isGoldenPrice(int num) {
            int sum = 0, maxDigit = 0, temp = num;

            while (temp != 0) {
                int digit = temp % 10;
                sum += digit;
                maxDigit = Math.max(maxDigit, digit);
                temp /= 10;
            }

            return (sum - maxDigit) == maxDigit;
        }

}

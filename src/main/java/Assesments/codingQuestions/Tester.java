package Assesments.codingQuestions;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- >0){
                int n = sc.nextInt();
                System.out.println(Solution.equationSum(n));
            }
    }
}

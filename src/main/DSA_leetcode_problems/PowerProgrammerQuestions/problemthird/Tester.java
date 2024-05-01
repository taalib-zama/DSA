package PowerProgrammerQuestions.problemthird;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.nextLine().trim());
        int c = Integer.parseInt(scan.nextLine().trim());
        int result = Solution.smallestY(x,c);
        System.out.println(result);
    }
}

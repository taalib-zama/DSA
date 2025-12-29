package backlog.dsa_udemy;

import static backlog.dsa_udemy.test.largestLand;

public class test2 {
    public static void main(String[] args) {
        int[][] houses = {{5, 2}, {3, 7}, {1, 9}, {2, 0}, {5, 15}, {4, 30}};
        int[] result = largestLand(houses);
        System.out.println(result[0] + " " + result[1]);  // Output: 4 5
    }
}

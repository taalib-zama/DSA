package arrays.coinchange;

public class Tester {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(Solution.coinChange(coins, amount));
    }
}

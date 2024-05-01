package arrays.coinchange;

import java.util.Arrays;

public class Solution {
    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] coinsCount = new int[amount+1];
        Arrays.fill(coinsCount, amount +1);
        //edge case.
        coinsCount[0] = 0;
        for(int i = 0; i <=amount; i++){
            for(int j = 0; j <coins.length ; j++){
                if(coins[j] <= i){
                    coinsCount[i] = Math.min(coinsCount[i], 1+ coinsCount[i-coins[j]]);

                }
                else{
                    break;
                }
            }
        }
        return coinsCount[amount] > amount ? -1 : coinsCount[amount];
    }
}

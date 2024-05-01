package test;

public class Solution {
    public static int countChocolates(int amount){
        // amount  = 5;
        // o/p - 7.
        // 1- 5/5 = total = 5, wrappers = .
        // 2 - if (wrapper >=3) , total1  = wrapper/3 = 1 , left = wrapper %3 + total1,
        //3 = wrapper = 2 + 1 = 3 ; total2 = (wrapper >= 3) -> total = 3/3 = 1 , left = 0. --> return.4
        if(amount == 0){
            return 0;
        }
        int countChocolates = amount;
        int leftWrapper = amount;
        while(leftWrapper > 0){
            if(leftWrapper >= 3){
                countChocolates = countChocolates + leftWrapper/3;
                leftWrapper = leftWrapper %3 + leftWrapper/3;
            }
            else {
                return countChocolates;
            }
        }
        return 0;
    }
}

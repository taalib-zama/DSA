package arrays.noOfOddNumbers;

public class Solution {
    public int countOdds(int low , int high){
        int totalNumbers = high - low +1;
        int countOdds = 0;
        if(totalNumbers %2 == 0){
            countOdds = totalNumbers/2;
        } else {
            if(low %2 != 0 || high%2 !=0){
                countOdds = totalNumbers/2 +1;
            }
            else{
                countOdds = totalNumbers/2;
            }
        }
        return countOdds;
    }
}

class Tester{
    public static void main(String[] args) {
        Solution s1 = new Solution();
        Solution s2 = new Solution();
        System.out.println(s1.countOdds(3,7));
        System.out.println(s2.countOdds(8,10));
    }
}
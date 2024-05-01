package integers.sumOfFirstNNumbers.nativeApproach;

public class Solution {
    public static int sum(int n){
        //time complexity = O(n)
        int sum = 0;
        for(int i =0 ; i <=n;i++){
            sum =sum +i;
        }
        return sum;
    }
}

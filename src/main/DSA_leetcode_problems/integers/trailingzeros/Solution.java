package integers.trailingzeros;

public class Solution {
    public static int trailingZeroes(int n) {
        int count = 0;
        while(n>0){
            n/=5;
            count+=n;
        }
        return count;

    }
}


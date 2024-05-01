package GFGProblems.predictTheColoumn;

public class Solution {
    public static int columnWithMaxZero(int a[][], int n) {

        // traversing coloumn wise :
//        int minSum = 3;
//        int currentIndex = 0;
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for(int j = 0 ; j < n ; j++){
//                sum =  sum + a[j][i];
//            }
//            if(sum < minSum){
//                minSum = sum;
//                currentIndex = i;
//            }
//
//        }
//        return currentIndex;
//    }/**/
    
    //this doesn't work because coloumn with 3 0's and coloumn with 8 0's wllhave same sum. SO Keeping track of 0's
        int rows = a.length;
        int cols = a[0].length;
        int maxZeroCount = 0;
        int maxZeroColumn = 0;

        for (int col = 0; col < cols; col++) {
            int zeroCount = 0;
            for (int row = 0; row < rows; row++) {
                if (a[row][col] == 0) {
                    zeroCount++;
                }
            }
            if (zeroCount > maxZeroCount) {
                maxZeroCount = zeroCount;
                maxZeroColumn = col;
            }
        }

        return maxZeroColumn;
}
}

package GFGProblems.matrixInterchnage;

public class Solution {
    static void interchange(int a[][],int r, int c){

        // Your code here
        // Swap the first column with the last column
        for (int i = 0; i < r; i++) {
            int temp = a[i][0];
            a[i][0] = a[i][c - 1];
            a[i][c - 1] = temp;
        }

        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }


}

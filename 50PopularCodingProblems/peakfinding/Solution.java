package peakfinding;

public class Solution {
    public static int peakElement(int[] arr){
        //Time complexity O(n).
        for(int i = 0; i < arr.length; i++){
            if((i ==0 || arr[i] >= arr[i-1]) && (i == arr.length-1 || arr[i] >= arr[i+1])){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] arr = {{2,3,-8,4,1},{1,5,7,8,3,9}};
        for(int i[] : arr)
        System.out.println(peakElement(i));
    }
    
}

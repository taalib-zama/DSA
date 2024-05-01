package GFGProblems.searchAnElement;

public class Solution {
    static int search(int arr[], int N, int X)
    {
        // Problem :  returns the index of first occurrence of X in the given array. If the element X
        // does not exist in the array, the function should return -1.
        int index = 0;
        for(int x : arr){
            if(x==X){
                return index;
            }
            else{
                index++;
            }
        }
        return -1;

    }
}

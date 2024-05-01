package PowerProgrammerQuestions.LongestContiniousSequence;

public class Solution {
    public static int LongestContiniousSequence(int[] arr) {
        //{0,1,0,1,1,0,1,1,1,0,1}
        int arrLen = arr.length;
        int currSequenceLength = 0;
        int maxSequenceLength = 0;
        int index = 0;
        //exit condition for arrays with only 1's or jump to
        //first occourence of 0.
        while (arr[index] ==1) {
            if(index == arrLen-1){
                return 0;           //exit condition for array with all 1's.
            }
            index = index+1;
        }
        //iterate the array from first occourence of 0.
        for(int i = index; i < arrLen; i++){
            if(arr[i] ==0){
                maxSequenceLength = currSequenceLength;
                currSequenceLength = 0;
            }
            else {
                currSequenceLength += 1;
            }
        }
        if (currSequenceLength > maxSequenceLength){
            return currSequenceLength;
        }
        else {
            return maxSequenceLength;
        }

    }
}

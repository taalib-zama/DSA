package removeduplicates.solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static int[] removeDuplicates(int[] arr){
        if(arr.length == 0){
            int[] emptyArr = new int[0];
            return emptyArr;
        };
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList();
        list.add(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1])
                list.add(arr[i]);
        }
        int[] noDuplicatesArr = new int[list.size()];
        for(int i = 0; i < noDuplicatesArr.length; i++)
            noDuplicatesArr[i] = list.get(i);
        return noDuplicatesArr;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,3,2,4,4,1};
        for(int i : removeDuplicates(arr)){
            System.out.print(i +",");
        }
    }
}

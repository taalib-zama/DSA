package removeduplicates.usinghashmap;

import java.util.HashSet;
import java.util.Set;

public class Solution {

//    public static <T> Set<T> convertArrayToSet(T array[])
//    {
//        // create a set from the Array
//        return Arrays.stream(array).collect(
//                Collectors.toSet());
//    }
    public static int[] removeDuplicates(int[] arr){
        Set<Integer> newSet = new HashSet<>();
        for(int i : arr){
            newSet.add(i);
        }

        int[] resultArr = new int[newSet.size()];
        int i = 0;
        for(int element : newSet){
            resultArr[i++] = element;
        }
        return resultArr;

    }


    public static void main(String[] args) {
        int[] arr = {4,2,3,2,4,4,1};
        for(int i : removeDuplicates(arr)){
            System.out.print(i +",");
        }

    }
}

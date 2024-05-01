package PowerProgrammerQuestions.probsecond;

import java.util.ArrayList;



public class Solution {
    public static int noOfWinners(int[] arr) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        int[] arrnew = new int[arr.length];
        int count = 0;
        int n = arr.length;
        int sum = 0;
        //sum of array
        for (int i : arr) {
            sum += i;
        }
        int average = sum / n;
        //itewrate for no of elements greater than mean
        for (int i = 0; i < n; i++) {
            if (arr[i] >= average)
                count += 1;
            else {
                x.add(arr[i]);
            }
        }
        if (x.isEmpty()) {
            //do nothing
        } else {
               count += checksubarray(x);

        }
        return count;
    }

        //need to count number of subarrays having sum >=mean
        static int checksubarray(ArrayList<Integer> arr){
            Integer sum = 0;
            int count = 0;
            Integer averagesubarray =0;
            for (Integer number : arr) {
                sum += number;
            }
            averagesubarray =  sum/ arr.size();
            for(Integer number : arr) {
                if (number > averagesubarray) {
                    count += 1;
                } else {
                    //do nothing.
                }
            }
            return count;
        }





//        int result = countGreater(arr, n, average);
//        return result;

    static int countGreater(int arr[], int n, int k)
    {
        int l = 0;
        int r = n - 1;
        int leftGreater = n;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] >= k) {
                leftGreater = m;
                r = m - 1;
            }

            else
                l = m + 1;
        }
        return (n - leftGreater);
    }


//divide and conquer is used need to check
}

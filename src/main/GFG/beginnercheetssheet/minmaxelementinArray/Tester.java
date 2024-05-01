package beginnercheetssheet.minmaxelementinArray;

public class Tester {
    //Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.
    //getMinMax() which takes the array A[] and its size N as inputs and returns the minimum and maximum element
    // of the array.
    static void getMinMax(long[] a, long n)
    {
        //Write your code here
        //convert array to arrayList
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            if(a[i] < min)
            {
                min = a[i];
            }
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        System.out.println(min + " " + max);
        Pair pair = new Pair(min, max);

    }

    public static void main(String[] args) {
        long[] arr = {3, 2, 1, 56, 10000, 167};
        Tester.getMinMax(arr, arr.length);
    }
}

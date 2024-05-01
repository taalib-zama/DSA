package peakfinding.usingBinarySearch;

public class UsingBinarySeaarch {

    //time complexity : O(logn)
    //using binarySearch
    //time complexity : O(logn)
    //since binary search only can be implemented on sorted element this doesn't follows the same,
    //we can determine te type of half weather its strictly increasing/decreasing.
    //if arr[mid] < arr[mid+1] - it means there is an increasing sequence towards right of mid.
    static int findPeak(int[] arr) {
        int leftIndex = 0;                         //1st pointer on left element
        int rightIndex  = arr.length - 1;         //2nd pointer on last element.
        while (leftIndex < rightIndex) {          //iterate until left and right pointers doesn't meet
            int mid = (leftIndex + rightIndex) / 2;
            if (arr[mid] < arr[mid + 1]){         //if element in middle is smaller than the next element
                // It Implies peak is in right half of array. So we move leftpointer to mid+1
                leftIndex = mid + 1;
            }
            else rightIndex = mid;
        }
        return leftIndex;
    }

    //similar implementation can be done using recursion.
    static int findPeakRecursion(int[] arr, int left, int right){
        if(left >= right) return left;
        int mid = (left + right)/2;
        if(arr[mid] < arr[mid+1])
            return findPeakRecursion(arr, mid+1, right);
        else
            return findPeakRecursion(arr, left, mid);
    }

    public static void main(String[] args) {
        int[][] arr = {{2,3,-8,4,1},{1,5,7,8,3,9}};         //highest peak is returned in this case
        for(int i[] : arr)
            System.out.println(findPeak(i));

        //using recursion.
        for(int i[] : arr){
            System.out.println(findPeakRecursion(i,0,i.length-1));
        }
    }
}

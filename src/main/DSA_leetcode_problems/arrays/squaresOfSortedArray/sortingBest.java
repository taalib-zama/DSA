package arrays.squaresOfSortedArray;

class Tester{
    public static void main(String[] args) {
        int arr[] = {-7,-3,2,3,11};         //this should be sorted.
        int sortedArr[] = sortingBest.sort(arr);
        for(int a : sortedArr){
            System.out.println(a);
        }

    }
}

 class sortingBest {
    //sorting only works when sorting in order of descending order from ascending order.
public static int[]sort(int[] nums){
    int startIndex = 0;
    int[] res = new int[nums.length];
    int endIndex = nums.length - 1;
    int index = endIndex;
    while( endIndex >= startIndex){
        if(Math.abs(nums[startIndex]) > Math.abs(nums[endIndex])){
            res[index] = nums[startIndex]*nums[startIndex];
            startIndex++ ;
            index--;
        }
        else{
            res[index] = nums[endIndex]*nums[endIndex];
            endIndex--;
            index--;
        }
    }
    return res;
}
}

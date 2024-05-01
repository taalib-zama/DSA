package arrays.examples.evenNumberOfDigits;

class Tester {
 public static void main(String[] args) {
  int arr[] = {12,345,2,6,7896};
  System.out.println(Solution.findNumbers(arr));
 }
}
  class Solution {
  public static int findNumbers(int[] nums) {
    int count = 0;
    int result = 0;
   for (int i = 0; i < nums.length; i++) {
    int countOfDigits = countNoOfDigits(nums[i]);
    if(countOfDigits %2 == 0){
     count ++;
    }
   }
   return count;
   }

   public static int countNoOfDigits(int number){
   int  digit = 0, count = 0;
    while(number>0){
     digit = number %10;
     count +=1;
     number = number /10;
    }
   return count;
  }
 }



package arrays.moveZerosToEnd;

public class Tester {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int[] arr2 = {0};
        Solution.moveZeroes(arr);
        Solution.moveZeroes(arr2);
        for(int i : arr){
            System.out.print(i +",");
        }
        for(int j : arr2){
            System.out.println(j +",");
        }
    }
}

package integers.plusOne;

import integers.plusOne.nativeSol.Solution;

public class Tester {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {9,8,7,6,5,4,3,2,1,0};
        for(int i : integers.plusOne.nativeSol.Solution.plusOne(arr1)){
            System.out.print(i +",");
        }
        System.out.println();
        for(int j : Solution.plusOne(arr2)){
            System.out.print(j +",");
        }
    }
}

package prefixSum;

public class Tester {
    public static void main(String[] args) {
        int[] arr = {10,4,-8,7};
        int[] result = Solution.printPrefix(arr);
        for(int i : result){
            System.out.print(i + " ");
        }

        System.out.println();


        System.out.println(Solution.waysToSplitArray(arr));
    }
}

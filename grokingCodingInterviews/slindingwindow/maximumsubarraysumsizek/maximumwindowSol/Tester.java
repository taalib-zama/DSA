package slindingwindow.maximumsubarraysumsizek.maximumwindowSol;

public class Tester {
    public static void main(String[] args)
    {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(Solution.maxSum(arr, n, k));
    }
}

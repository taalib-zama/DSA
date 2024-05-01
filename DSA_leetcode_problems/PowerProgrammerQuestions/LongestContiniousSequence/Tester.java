package PowerProgrammerQuestions.LongestContiniousSequence;

public class Tester {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,0,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1};
        int[] arr2 = {1,1,1,0,1,1,1,1,0,0,0,1,1,1,1,1};
        int[] arr3 = {0,0,0};
        int[] arr4 = {1,1,1,1,1,1};
        System.out.println(Solution.LongestContiniousSequence(arr));
        System.out.println(Solution.LongestContiniousSequence(arr2));
        System.out.println(Solution.LongestContiniousSequence(arr3));
        System.out.println(Solution.LongestContiniousSequence(arr4));
    }
}

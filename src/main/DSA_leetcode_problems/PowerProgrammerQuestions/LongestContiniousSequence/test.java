package PowerProgrammerQuestions.LongestContiniousSequence;

import java.util.Scanner;

public class test {
    public static void main (String[] args) {
        // keep this function call here
        //input format : "new int[] {1,1,1,0,1}" this too was in string format.
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
//        String result = "new int[] {0,1,0,1,1,0,1,1,1,0,1}";
        String array = str.substring(11, str.length()-1);
        String[] splitArray = array.split(",");
        int[] intarray = new int[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            intarray[i] = Integer.parseInt(splitArray[i]);
        }
       System.out.print(Solution.LongestContiniousSequence(intarray));
    }
}

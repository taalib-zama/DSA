package integers.plusOne.nativeSol;

import java.util.Arrays;

public class Solution {
    public static int[] plusOne(int[] digits) {
        String num = Arrays.toString(digits).replaceAll("\\[|\\]|,|\\s", "");
        //convert string to int
        Long number = Long.parseLong(num);
        Long result  = number +1;
        String res = String.valueOf(result);
        int[] resultArray = new int[res.length()];
        for(int i =0; i < res.length(); i++){
            resultArray[i] = Integer.parseInt(String.valueOf(res.charAt(i)));
        }
        return resultArray;
    }

}

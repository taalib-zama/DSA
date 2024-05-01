package Assesments;

public class Solution {
    public static int convertNum(int num) {

        //Input: 12543
        //Output: 12043
        int result = 0;
        int counter = 1;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 5) {
                rem = 0;
            }
            num = num / 10;
            result = result + (counter) * rem;
            counter = counter * 10;

        }
        return result;
    }




    static int replaceDigit(int x, int d1, int d2)
    {
        int result = 0, multiply = 1;
        while (x / 10 > 0) {
            int remainder = x % 10;
            if (remainder == d1)
                result = result + d2 * multiply;
            else // else remain as such
                result = result + remainder * multiply;
            multiply *= 10;
            x = x / 10; // update the value
        }
        if (x == d1)
            result = result + d2 * multiply;
        else // else remain as such
            result = result + x * multiply;
        return result;
    }
}

package test.question2;

public class Solution {
    public static boolean checkNum(int num) {
        //49
        //16 + 81 = 97          //81 + 49 = 130     //1 + 9 + 0 = 10    //1 + 0 = 1
        //edge conditions - 10, 100 , 10^x.- return false.
        //if(logbase10(num) ==1) - return false.
        int result = 0;
        while (result != 1) {
            result = countSum(num);
            if (result == 1) {
                return true;
            }
            else {
                num = result;
            }
        }

        return false;
    }


    private static int countSum(int num) {

        //130 = 130/10 = 13, 130%10 = 0;
        // 13/10 = 1, 13%10 = 3
        //3/10 = 0, - break
        int sum = 0;
        while(num / 10 !=0){
            int units = num % 10;
            sum = sum + (units *units);
            num = num /10;
            if(num  > 10){
                //do nothing
            }
            else{

                sum = sum + (num*num);
            }

        }
        return sum;
    }
}

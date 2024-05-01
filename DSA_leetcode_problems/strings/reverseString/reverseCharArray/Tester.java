package strings.reverseString.reverseCharArray;

import strings.reverseString.reverseCharArray.Solution;

public class Tester {
    public static void main(String[] args) {
        char[] str = {'h','e','l','l','o'};
        Solution.reverseString(str);
        for(char i:str){
            System.out.println(i + " ");
        }
    }
}

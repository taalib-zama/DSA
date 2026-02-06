package FPQuestions;

public class Test2 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        //Output: 3
        //Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
        //Example 2:
        System.out.println("Max window : " + lengthOfLongestSubstring(s) );
    }


    public static int lengthOfLongestSubstring(String s) {
        int index1 = 0;
        int index2 = 0;
        int maxWindowSize = 0;
        char[] stringArr = s.toCharArray();
        for (index1 = 0; index1 < stringArr.length-1; index1++){
            for(index2 = index1 ; index2 < stringArr.length; index2++){
                if(stringArr[index1] != stringArr[index2] ){
                    index2++;
                }
                else {
                    maxWindowSize = s.substring(index1,index2-1).length();
                    index1++;
                }
            }
        }
        return maxWindowSize;
    }

}

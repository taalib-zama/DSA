package slidingWindow.maximumVowels;

public class Solution {
    public static int maxVowels(String s, int k) {
        int left = 0;
    int right= 0;
    int ans = 0;
    //abciiidef
    //abc, bci, cii, iii, iid, ide,def
    // Traverse the string
    //taking the first window.
    String s1 = s.substring(0,k);
    int maxVowels = checkVowelCount(s1);
        for(int i = 1 ; i < s.length()-(k-1);i++){
        s1= s.substring(i,i+k);
        int currMax = checkVowelCount(s1);
        if(currMax > maxVowels){
            maxVowels =currMax;
        }
    }
        return maxVowels;
}

    //count vowels Using regex.
    public static int checkVowelCount(String text) {
        return text.replaceAll("[^aeiouAEIOU]", "").length();
    }
}

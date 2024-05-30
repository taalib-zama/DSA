package leetcode_DSA_course.arrays.valid_anagram;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        //edge case - if length is not similar its not an anagram
        if (s.length() != t.length()) return false;
        //characters in the string are from ‘a’ to ‘z’ so we can represent ‘a’ as 0 and ‘z’ as 25 by doing
        // (int idx=ch-‘a’)
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i)-'a']++;  ///freq[a]++
            freq2[t.charAt(i)-'a']++;   //frq2[n]++
        }

        //now we compare freq1[i] and freq2[i] for every index i from 0 to 26 and if they are different we return false
        //otherwise, we return true
        for(int i=0;i<26;i++)
        {
            if(freq1[i]!=freq2[i])return false;
        }

        return true;


    }
}

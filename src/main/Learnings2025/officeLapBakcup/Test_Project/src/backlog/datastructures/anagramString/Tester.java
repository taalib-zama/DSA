package backlog.datastructures.anagramString;

public class Tester {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "margana";
        if (isAnagram(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean isAnagram(String a,String b){
        //edge case if same ignore.
        if (a.length() != b.length()) return false;
        //characters in the string are from ‘a’ to ‘z’ so we can represent ‘a’ as 0 and ‘z’ as 25 by doing
        // (int idx=ch-‘a’)
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0;i<a.length();i++){
            freq1[a.charAt(i)-'a']++;  ///freq[a]++
            freq2[b.charAt(i)-'a']++;   //frq2[n]++
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

package strings.longestsubstring;

import java.util.HashMap;

public class Tester {

    public static int longestSubstring(String str) {
        HashMap<Character, Integer> visited = new HashMap<Character, Integer>();//hashmap to store index and matching element.
        int maxLength = 0;
        int localMax =0;
        for(int i = 0; i < str.length(); i++){
            if(visited.containsKey(str.charAt(i))){
//                if(maxLength < localMax){
//                    maxLength = localMax;
//                }
            //updating the start index as the repeating character index stored in map.
                i = visited.get(str.charAt(i)) ;
                //new substring will start so resetting the value of localMax.
                localMax = 0;
                visited.clear();
            }
            else{
                visited.put(str.charAt(i),i);
                localMax +=1;
                maxLength = Math.max(localMax, maxLength);
            }

        }
        return maxLength;
    }

    public static void main(String[] args) {
        String[] str = { "Taalib", "suspicious", "pan", "abcdbeghef"};      //4,5,3,6
        for (String s : str) {
            System.out.println(longestSubstring(s));
        }
    }
}

package arrays.groupAnagrams;

import java.util.*;

public class Solution {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] chars = word.toCharArray();
            //to maintain a specified pattern of keys we sort the string
            Arrays.sort(chars);
            String sortedWord = new String(chars);  //making list of chars to string
            //key is the sorted string

            //ex : {aet,
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
        }


}

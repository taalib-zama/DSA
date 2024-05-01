package strings.interviewQuestions.countoccourencesofachar;

import java.util.HashMap;
import java.util.Map;

public class Solution {
            public static void countOccourences(String str){
                //using hashmap.
                HashMap<Character, Integer> visited = new HashMap<>();
                for (int i = 0; i < str.length(); i++) {
                    if (visited.containsKey(str.charAt(i))) {
                        Integer temp = visited.get(str.charAt(i)) + 1;
                        visited.replace(str.charAt(i), temp);    //updating count of letters.
                    } else {
                        visited.put(str.charAt(i), 1);
                    }
                }
                //loop over hashmap to print occourence of characters.
                //using for each loop over entry-set.
                for (Map.Entry<Character, Integer> entry : visited.entrySet())
                    System.out.println("Key = " + entry.getKey() +
                            ", Value = " + entry.getValue());
                // using iterators
//                Iterator<Map.Entry<Character, Integer>> itr = visited.entrySet().iterator();
//
//                while(itr.hasNext())
//                {
//                    Map.Entry<Character, Integer> entry = itr.next();
//                    System.out.println("Key = " + entry.getKey() +
//                            ", Value = " + entry.getValue());
//                }
            }
}

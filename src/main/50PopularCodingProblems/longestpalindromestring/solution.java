package longestpalindromestring;

import java.util.HashMap;
import java.util.Map;

public class solution {
    public static  int longestPalindrome(String str) {
        HashMap<Character, Integer> visited = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (visited.containsKey(str.charAt(i))) {
                    Integer temp = visited.get(str.charAt(i)) + 1;
                visited.replace(str.charAt(i), temp);    //updating count of letters.
            } else {
                visited.put(str.charAt(i), 1);
            }
            //after this all elements in hashmap will have its number of occurrences as values and char as keys.
        }
        //loop over hashmap and find the max length of sub-array.
        int count = 0;
        int extra = 0;
        for (Map.Entry<Character, Integer> mapElement : visited.entrySet()) {
            if (mapElement.getValue() > 1) {
                if(mapElement.getValue() % 2==0) {
                    count = count + mapElement.getValue();      //for even count we take it all as pair
                }
                else {
                    count = count + mapElement.getValue() - 1;
                    extra = mapElement.getValue() % 2;
                }//for non even we have a leftover along with pair that can
                                                        // be later used as middle element.
            }
            else if(mapElement.getValue() == 1){
                extra = 1;              //we can pick any
            }
            else{
                extra = 0;
            }
        }
        return count+extra;             //max length.
    }
}

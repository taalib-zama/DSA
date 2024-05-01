package arrays.checkifStringContainsAtLeastOneDuplicateChar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static boolean checkIfPangram(String sentence) {
        Boolean result = false;
        HashMap<Character, Boolean> checker= new HashMap<Character, Boolean>();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (checker.containsKey(c)) {
                checker.put(c, true);
            } else {
                checker.put(c, false);
            }
        }
        //iterating the hashmap.
        //Iterator<Map.Entry<Character,Boolean>> iterator = checker.entrySet().iterator();
        Iterator<Map.Entry<Character, Boolean>> checkerIterator = checker.entrySet().iterator();
        while(checkerIterator.hasNext()){
            Map.Entry<Character,Boolean> entry = checkerIterator.next();
            if(entry.getValue() == true){
                result = true;
            }
            else {
                //break the iteration if any has non-repeating char.
                return false;
            }
        }

        return result;
    }
}

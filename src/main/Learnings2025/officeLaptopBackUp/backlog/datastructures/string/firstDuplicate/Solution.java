package backlog.datastructures.string.firstDuplicate;

import java.util.HashMap;

public class Solution {
    //find first repepating char in a string.
    public static void main(String[] args) {
        System.out.println(firstDuplicate("abcba"));
        System.out.println(firstDuplicate("abc"));
        System.out.println(firstDuplicate("abac"));
        System.out.println(firstDuplicate("ab"));
    }
    public static char firstDuplicate(String s) {
        //create a boolean array of size 256 to store the occurence of the char.
        boolean[] visited = new boolean[256];
        //iterate over the string.
        for (char c: s.toCharArray()) {
            //if the char is already visited then return the char.
            if (visited[c]) {
                return c;
            }
            //mark the char as visited.
            visited[c] = true;
        }
        //return null if no repeating char found.
        return '\0';
    }


    public static int findFirstDuplicate(String s){

        HashMap<Character, Boolean> visited = new HashMap<>();
        for (char c: s.toCharArray()) {
            if ( visited.containsKey(c)){
                return c;
            }
            else {
                visited.put(c, true);
            }
        }
        return 0;
    }

    //to check the index :
    //iterate via the index.
}

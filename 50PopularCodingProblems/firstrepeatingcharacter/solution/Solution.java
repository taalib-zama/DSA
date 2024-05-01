package firstrepeatingcharacter.solution;

import java.util.HashMap;

public class Solution {
    public static char firstRepeatingChar(String str){
        HashMap<Character, Boolean> visited = new HashMap<Character, Boolean>();
        for(int i = 0 ; i < str.length(); i++){
            if(visited.containsKey(str.charAt(i))){
                System.out.println("Found element index : " +i);
                return str.charAt(i);
            }
            else{
                visited.put(str.charAt(i),true);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String[] str = {"responsible", "Taalib", "suspicious", "pan"};
        for(String s : str){
            System.out.println(firstRepeatingChar(s));
        }

    }
}

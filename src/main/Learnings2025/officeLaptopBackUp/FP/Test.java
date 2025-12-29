package FP;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
            System.out.println("Hello, World!");
            String s = "abacbcedf"; // d
        //d -> putting it to hashset ->
            // find the first non-repeating Character
        HashMap<Character, Integer> pivot = new HashMap<>();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i ++){
            if (pivot.containsKey(arr[i])){
                pivot.put(arr[i], pivot.get(arr[i]) + 1);
            }
            else{
                pivot.put(arr[i], 1);
            }
        }
        System.out.println(pivot);

        for(Map.Entry<Character, Integer> element : pivot.entrySet()){
            if (element.getValue() ==1){
                System.out.println(element.getKey());
                break;
            }
            else {
                continue;
            }
        }
    }
}

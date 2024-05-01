package findtheduplicate;

import java.util.HashMap;

public class Solution {
    public static int findDuplicate(int[] arr){
        //using a hashtable as in previous problems. Using hash table time complexity is O(n).
        HashMap<Integer, Boolean> visited = new HashMap<>();
        for(int element  : arr){
            if(visited.containsKey(element)){
                return element;
            }
            else
            visited.put(element, true);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,1,3,1};
        System.out.println(findDuplicate(arr));
        }
    }


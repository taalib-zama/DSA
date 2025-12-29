package backlog.datastructures.arrays.duplciateElements;

import java.util.HashMap;

public class Solution {

        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 5,1};
            removeDuplciate(arr);

        }

        public static int removeDuplciate(int arr[]) {
            HashMap<Integer, Boolean> visited = new HashMap<>();
            for (int a: arr) {
                if ( visited.containsKey(a)){
                    return a;
                }
                else {
                    visited.put(a, true);
                }
            }
            return 0;
        }
    }


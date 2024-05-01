package getsubstringindex.bruteforce;

public class Solution {
    //time complexity O(nm)
    public  static int substringindex(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        for(int i = 0; i <= n-m ; i++ ){
            boolean found = true;
            for(int j = 0; j < m ; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if(found){
                return i;
            }
        }
        return -1;
    }
}

package strings.StringDuplicates;

public class Solution {
    public static String removeDuplicates(String str){
        // remove duplicates from string without using any prebuild methods/collection datatypes.
        //native approach - loop over current string and loop over array of chars  over the reslt string for each element and cehck if
        //its there if not then apppend, it will take
        String resultString = "";
        for(int i = 0; i < str.length()-1; i++){
            if(i ==0){
                resultString = resultString + str.charAt(i);
            }
            if(resultString.charAt((resultString.length()-1)) == str.charAt(i)){
                //pass
            }
            else{
                resultString = resultString + str.charAt(i);
            }

        }
        return resultString;
    }

}

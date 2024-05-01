package findpairsumsuptoK;

public class BruteForceSol {
    public static void main(String[] args) {
        int[] arr = {4,5,1,7,2};
        int k = 3;
        System.out.println("Pair sum found ? "+pairSums(arr,k));
    }


    //Two loops used to find the desired elements. Time complexity O(n^2).
    public static boolean pairSums(int[] arr, int k){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0; j< arr.length; j++){
                if(arr[i] + arr[j] == k){
                    System.out.println("Paired sum elements : " +arr[i] + "," + arr[j]);
                    return true;
                }
            }
        }
        return false;
    }
}

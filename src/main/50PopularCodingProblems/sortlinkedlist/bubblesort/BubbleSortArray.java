package sortlinkedlist.bubblesort;

public class BubbleSortArray {
    public static void main(String[] args) {
        int[] array1 = {20,35,-15, 7 , 55, 1, -22};
        for(int i : bubbleSort(array1)){
            System.out.print(i+",");
        }
    }

    public static int[] bubbleSort(int[] arr){              //last unsortediNdex should be lst element in beginning.
        for(int lastUnsortedIndex = arr.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex ; i++){
                if(arr[i] > arr[i+1]){
//                    swap(arr, i , i+1);
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }

//    public static void swap(int[] array,int i, int j){                      //i, j indices of elements we want to swap.
//        if(i == j){
//            return;
//        }
//        int temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
//    }
}

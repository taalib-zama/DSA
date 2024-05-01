package sortingAlgo.selectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array1 = {20,35,-15, 7 , 55, 1, -22};
        for(int i : selectionSort(array1)){
            System.out.print(i+",");
        }
    }

    public static int[] selectionSort(int[] arr){              //last unsortediNdex should be lst element in beginning.
        for(int lastUnsortedIndex = arr.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;            //larget element index be stored in every iteration.
            for(int i = 1; i <= lastUnsortedIndex-1 ; i++){
                if(arr[i] > arr[largest]){
                    largest = i;
                }
            }
            swap(arr, largest, lastUnsortedIndex);
        }
        return arr;
    }

    public static void swap(int[] array,int i, int j){                      //i, j indices of elements we want to swap.
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

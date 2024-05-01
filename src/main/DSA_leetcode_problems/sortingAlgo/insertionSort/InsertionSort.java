package sortingAlgo.insertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array1 = {20,35,-15, 7 , 55, 1, -72};
        sort(array1);
        for(int i : (array1)){
            System.out.print(i+",");
        }

    }
    public static void sort(int[] arr){
        //assuming the element at index is in sorted position.
        //so the first undorted index start at 1.
        for(int firstUnsortedIndex  = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++){
            int newElement = arr[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0 && arr[i-1] >newElement ; i--){
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }
    }
}

package beginnercheetssheet.searchElementInArray;

public class Tester {
    static int search(int arr[], int N, int X) {
        // Your code here
        int index = 0;
        for (int a : arr) {
            if (a == X) {
                return index;
            } else {
                index++;
            }
        }
        return -1;
    }

}

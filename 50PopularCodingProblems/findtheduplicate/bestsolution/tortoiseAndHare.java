package findtheduplicate.bestsolution;

public class tortoiseAndHare {
    // Time complexity: O(n)
    // Space complexity: O(1)

    public static int findDuplicate(int[] arr){
        int hare = 0, tortoise = 0;
        do{
            tortoise = arr[tortoise];
            hare = arr[arr[hare]];
        }while(tortoise != hare);
        tortoise = 0;                   //after first match, the tortoise position is resetted to index 0.
        while(tortoise != hare){
            tortoise = arr[tortoise];
            hare = arr[hare];
        }
        return tortoise;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,1,3,1};
        System.out.println(findDuplicate(arr));
    }
    }

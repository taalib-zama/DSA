package arrays.contains_duplicate;

public class Tester {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        if(Solution.containsDuplicate(arr)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        //enhanced solution
        if(Solution_enhanced.containsDuplicate(arr)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }


    }
}

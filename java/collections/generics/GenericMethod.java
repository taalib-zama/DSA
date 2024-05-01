package collections.generics;

public class GenericMethod {
    public static <E> void displayDetails (E[] inputArray) {    //the type parametre <E> replaces itself
        //with datatype of array passed during execution.
        for (E e : inputArray) {
            System.out.print(e+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,4,5,2,3};
        GenericMethod.displayDetails(intArray);

        //example 2
        String[] sarr = {"One","Two","Three"};
        GenericMethod.displayDetails(sarr);

    }
}



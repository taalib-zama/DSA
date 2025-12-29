package test;

import java.util.Arrays;

public class test33 {
    public static void main(String[] args) {
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        // int lastElement = Arrays.Stream(birdsPerDay).reduce((first, second) -> second).orElse(0);


        //birdsPerDay[birdsPerDay.length - 1] = lastElement;

        birdsPerDay[1] = 10;


        //iterate over array to check it there is any values as 0 using streams
        boolean hasZero = Arrays.stream(birdsPerDay).anyMatch(bird -> bird == 0);


        //sum the elements in array from index 1 to 4 using streams
        try {
            int sum = Arrays.stream(birdsPerDay, 1, 5).sum();
            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        int noOfBusyDyas = (int)Arrays.stream(birdsPerDay).filter(bird -> bird >=5).count();
        System.out.println(noOfBusyDyas);

        System.out.println(birdsPerDay.length > 5 ? 8 : birdsPerDay.length);



    }

}

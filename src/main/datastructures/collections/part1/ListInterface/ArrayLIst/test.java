package collections.part1.ListInterface.ArrayLIst;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
        // Adding elements [5, 3, 1] to the list
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(6);
        System.out.println(list);


        System.out.println(list.get(2)); // Output: 1


        list.add(0, 4);

        list.remove(1);

        System.out.println("list: " + list);

    }
}

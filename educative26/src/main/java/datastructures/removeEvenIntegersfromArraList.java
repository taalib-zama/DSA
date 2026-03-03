package datastructures;

public class removeEvenIntegersfromArraList {
    public static void main(String[] args) {
            java.util.List<Integer> list = new java.util.ArrayList<>();
            // Adding elements [5, 3, 1] to the list
            list.add(5);
            list.add(3);
            list.add(1);
            list.add(6);
            System.out.println(list);

            // Remove even integers from the list
            //list.removeIf(n -> n % 2 == 0);
           // System.out.println("List after removing even integers: " + list);

            list.stream().filter(n -> n % 2 != 0).forEach(System.out::println);


    }
}

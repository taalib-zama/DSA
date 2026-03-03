package datastructures;

public class FindTwoNumbersThatAddUptoK {
    public static void main(String[] args) {
        //given a list nums and a number k, return two numbers in the list that add up to k, otherwise return -1
        java.util.List<Integer> nums = new java.util.ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        int k = 3;
        //find two numbers in the list that add up to k using streams
        java.util.Optional<java.util.List<Integer>> result = nums.stream()
                .flatMap(i -> nums.stream().map(j -> java.util.List.of(i, j)))
                .filter(pair -> pair.get(0) + pair.get(1) == k)
                .findFirst();

        //note :
        // For each element i in the nums list, it creates another stream of pairs (i, j) where j is every element in the nums list.
        //java.util.List.of(i, j) creates a pair (as a list) of the two number

        // Filters the pairs to include only those where the sum of the two numbers
        // (pair.get(0) and pair.get(1)) equals k.

        if (result.isPresent()) {
            System.out.println("Two numbers that add up to " + k + ": " + result.get());
        } else {
            System.out.println(-1);
        }


        // Q. Why user flaptmap :
        // flatMap is used because each element i in the nums list is transformed
        // into a stream of pairs (i, j). flatMap flattens these streams of pairs into a
        // single stream for further processing. Using map would result in a stream
        // of streams, which is not suitable for filtering and finding pairs.
    }
}

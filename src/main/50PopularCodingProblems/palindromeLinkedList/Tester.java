package palindromeLinkedList;

public class Tester {

    //drive code.
    public static void main(String[] args) {
//        List<Integer> list = new LinkedList(Arrays.asList(5,4,7,8,7,4,5)); // approach 2 for adding elements to LL.
//        Solution.LinkedList myList = new Solution.LinkedList(
//                new Solution.Node(
//                        5,
//                        new Solution.Node(
//                                4,
//                                new Solution.Node(
//                                        7,
//                                        new Solution.Node(
//                                                8,
//                                        ))))
//        );
        Solution.LinkedList myList = new Solution.LinkedList();
        myList.head = new Solution.Node(5);
        myList.head.next = new Solution.Node(4);
        myList.head.next.next = new Solution.Node(7);
        myList.head.next.next.next = new Solution.Node(8);
        myList.head.next.next.next.next = new Solution.Node(7);
        myList.head.next.next.next.next.next = new Solution.Node(3);
        myList.head.next.next.next.next.next.next = new Solution.Node(5);
        Solution sol = new Solution();
        boolean result = sol.isPalindromeList(myList);
        System.out.println(result);

    }
}

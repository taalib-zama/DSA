package sortlinkedlist.bubblesort.bubblesortlinkedlist;

public class Tester {
    public static void main(String[] args) {
        Solution.LinkedList myList = new Solution.LinkedList();
        myList.head = new Solution.Node(5);
        myList.head.next = new Solution.Node(4);
        myList.head.next.next = new Solution.Node(7);
        myList.head.next.next.next = new Solution.Node(8);
        myList.head.next.next.next.next = new Solution.Node(7);
        myList.head.next.next.next.next.next = new Solution.Node(3);
        myList.head.next.next.next.next.next.next = new Solution.Node(5);
        Solution sol = new Solution();
        sol.sortList(myList);
        sol.printList(myList);

    }
}

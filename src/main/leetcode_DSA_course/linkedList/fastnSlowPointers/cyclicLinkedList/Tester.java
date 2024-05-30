package linkedList.fastnSlowPointers.cyclicLinkedList;

public class Tester {
    public static void main(String[] args) {

            ListNode node1 = new ListNode(2);
            ListNode node2 = new ListNode(3);
            ListNode node3 = new ListNode(5);
            ListNode node4 = new ListNode(7);
            ListNode node5 = new ListNode(9);
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node1;
            //print the linkedlist.
            /*ListNode currentNode = node1;
                while (currentNode != null) {
                System.out.print(currentNode.val + " ");
                currentNode = currentNode.next;
                }
                System.out.println();*/


            System.out.println(Solution.hasCycle(node1));

    }

}

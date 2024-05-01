package LinkedList.removeDuplicates;

import java.util.List;

public class Tester {
    public static void main(String[] args) {

            // Creating nodes
            ListNode node1 = new ListNode(1);
            ListNode node2 = new ListNode(1);
            ListNode node3 = new ListNode(2);
            ListNode node4 = new ListNode(3);
            ListNode node5 = new ListNode(3);

            // Connecting nodes to form a linked list
            node1.next = node2;
            node2.next = node3;
        node3.next = node4;
        node4.next = node5;

            // Printing the linked list values
            System.out.print("Linked List: ");
            printLinkedList(node1);
        }

        // Helper method to print the linked list
        public static void printLinkedList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }

}

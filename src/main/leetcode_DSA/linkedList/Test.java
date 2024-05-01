package linkedList;

public class Test {
    //create a class to demonstrate iteration of a linkedlist
    public static class ListNode {
        int val;
        ListNode next;
        ListNode (int val) {
            this.val = val;
        }
    }
    //enhance it
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        one.next = two;
        ListNode head = one;

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
    //q:exmplin this to me
    //a:ok
    //q:what is the difference between this and the one in the linkedlistdefinition
    
    
}

package linkedList.fastnSlowPointers.getmMiddle;
public  class Solution {
    public static int  getMiddle(ListNode head) {
        int length = 0;
        ListNode dummy = head;
        while (dummy != null) {
            length++;
            dummy = dummy.next;
        }
        //iterate with the first pointer, ge through last of list to get the length.
        //using this length, iterate the linkedlist till half the length.

        for (int i = 0; i < length / 2; i++) {
            head = head.next;
        }
        //here the head is preserved because we have used dummy as first pointer.

        return head.val;
    }
}

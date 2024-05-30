package leetcode_DSA_course.linkedList.midddleofLinkedList;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode end = head;
        //we move the middle node by one step and the end node by 2 steps. we'll keep doing this until
        //the end node will have space/options to move 2 steps.
        while(end!=null && end.next != null){
            // 3 1 2 7 7
            //moving middle 1 step in  every loop.
            middle = middle.next;
            end = end.next.next;

        }
        //now after this our middle node will be in the right place.
        return middle;
        //time complexity = O(n) - proportional value as atlest we'll be moving O(n/2) moves.

    }
}

package palindromeLinkedList.bestsolution;

public class Solution {
        // By each time searching for the position of right pointer:

// Time complexity: O(n�)
// Space complexity: O(1)

        static class Node{
            Integer data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
            }

            Node(int data, Node next){
                this.data = data;
                this.next = next;
            }
        }

        static class LinkedList{
            Node head;

            LinkedList(){
                this.head = null;
            }

            LinkedList(Node head){
                this.head = head;
            }
        }

        static boolean isPalindromeList(LinkedList list){
            int length = 0;
            Node temp = list.head;
            while(temp != null){
                length++;
                temp = temp.next;
            }
            Node left = list.head;
            for(int i = 0; i < length/2; i++){
                Node right = list.head;
                for(int j = 0; j < length-i-1; j++) right = right.next;
                if(left.data != right.data) return false;
                left = left.next;
            }
            return true;
        }
    }



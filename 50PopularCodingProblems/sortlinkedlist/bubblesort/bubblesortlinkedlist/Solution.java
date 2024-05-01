package sortlinkedlist.bubblesort.bubblesortlinkedlist;

public class Solution {

    static class Node{
        Integer data;
        Node next;

        Node(int data){                        //first node constructor
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next){             //nth node constructor.
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

     static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }
    static void sortList(LinkedList list) {
        Node i = list.head;
        while (i != null) {
            Node j = list.head;
            while (j.next != null) {
                if (j.data > j.next.data) {
                    int temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
                }
                j = j.next;
            }
            i = i.next;
        }
    }
}

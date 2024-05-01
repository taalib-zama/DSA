package LinkedList.singlyLinkedList;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;
     public void addToFront(Employee employeee){
         EmployeeNode node = new EmployeeNode(employeee);
         node.setNext(head);
         head = node;
         size++;
     }

     public EmployeeNode removeFromFront(){
         if(isEmpty()){
             return null;
         }
         EmployeeNode removedNode = head;
         head = head.getNext();
         size--;
         //cleaning up the reference of removed node.
         removedNode.setNext(null);
         return removedNode;
     }

     public void printList(){
         EmployeeNode current = head;
         System.out.print("HEAD=> ");
         while(current != null){
             System.out.print(current);
             System.out.print("->");
             current  = current.getNext();
         }
         System.out.println("null");
     }

    public int getSize() {
         return size;
    }

    public boolean isEmpty(){
         return head==null;
    }
}

package LinkedList.singlyLinkedList;

public class Tester {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoes = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);


        EmployeeLinkedList list = new EmployeeLinkedList();
        //calling isEmpty method before we add anything.
        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoes);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());
        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
    }
}

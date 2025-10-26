package Collections;

public class ComparatorVsComparable {
    public static void main(String[] args) {
        // Example of Comparable
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        System.out.println("Using Comparable:");
        System.out.println(person1.compareTo(person2)); // Should print a positive number since Alice is older than Bob

        // Example of Comparator
/*        PersonComparator personComparator = new PersonComparator();
        System.out.println("Using Comparator:");
        System.out.println(personComparator.compare(person1, person2)); // Should print a positive number since Alice is older than Bob*/
    }
}

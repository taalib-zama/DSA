package collections.finalmethodandClass.hashmaps;

public class Tester {
    public static void main(String[] args) {
        Person person1 = new Person(1,10,"ABC");
        Person person2 = new Person(1,10,"ABC");

        System.out.println(person1.equals(person2));
        ///hashcodes of both person1 and person2, since this compares the hashcodes, hence false.
        ///because object.equals() checks for the object address for equality .)
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}

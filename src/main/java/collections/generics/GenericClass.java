package collections.generics;

public class GenericClass <T>{
    T value1;  //declaring instance variable of T type
    T value2;
    public GenericClass(T value1, T value2) {
        this.value1=value1;
        this.value2=value2;
    }
    public boolean checkEquals() {
        return value1.equals(value2);
    }

    public static void main(String[] args) {
        GenericClass<Integer> tester1 = new GenericClass<Integer>(10, 20);
        System.out.println(tester1.checkEquals()); //prints false
        GenericClass<String> tester2 = new GenericClass<String>("Ten", "Twenty");
        System.out.println(tester2.checkEquals()); //prints false

        GenericClass<Integer> tester3 = new GenericClass<Integer>(20, 20);
        System.out.println(tester1.checkEquals()); //prints false

    }

}

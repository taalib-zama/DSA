package javaBasics.staticClasses.Sample1;

public class OuterClass {

    static class StaticNestedClass {
        void display1() {
            System.out.println("This is a static nested class.");
        }
    }

    static void display() {
        System.out.println("Outer class static method");
    }

    //NON STATIC METHOD
    void display2() {
        System.out.println("Outer class non static method");
    }

    //creating an inner class
    class InnerClass {
        void display() {
            System.out.println("Inner class non static method");
        }
    }
}

package javaBasics.staticClasses.InnerClasses;

public class OuterClass {
    int instanceVar = 10;
    static int staticVar = 20;


    class InnerClass {
        void display() {
            System.out.println("Inner class non-static method");
            System.out.println("Accessing outer class instance variable: " + instanceVar);
            System.out.println("Accessing outer class static variable: " + staticVar);

        }
    }


}

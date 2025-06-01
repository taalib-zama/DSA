package javaBasics.staticClasses.Sample1;

public class Test {


    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        Object innerClass = new OuterClass().new InnerClass();
        outerClass.display2();  //calling outer class method.
        OuterClass.display();   //calling static method of outer class.



        // Creating an instance of the static nested class
        OuterClass.StaticNestedClass nestedInstance = new OuterClass.StaticNestedClass();
        nestedInstance.display1();

    }

}

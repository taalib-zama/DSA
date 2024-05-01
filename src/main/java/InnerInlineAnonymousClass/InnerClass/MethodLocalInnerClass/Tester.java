package InnerInlineAnonymousClass.InnerClass.MethodLocalInnerClass;

public class Tester {
    public static void main(String[] args) {

        // Creating object of outer class inside main()
        // method
        Outer x = new Outer();

        // Calling over the same method
        // as we did for inner class above
        x.outerMethod();
    }
}

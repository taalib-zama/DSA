package InnerInlineAnonymousClass.InnerClass.NestedInnerClass;

public class Outer {
    private int x = 10;
    class InnerClass {

        int y = 5;
        public void show()
        {
            System.out.println("In a nested class method");
            System.out.println("Accessing private instance variable of outer class : " +x);
        }
    }
}

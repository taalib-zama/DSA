package InnerInlineAnonymousClass.InnerClass.NestedInnerClass;

public class Tester {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        Outer.InnerClass InnerObj = o1.new InnerClass();    // Note how inner class object is created inside. General convention
        InnerObj.show();
        System.out.println(InnerObj.y);

    }
}

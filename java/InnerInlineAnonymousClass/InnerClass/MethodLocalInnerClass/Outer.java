package InnerInlineAnonymousClass.InnerClass.MethodLocalInnerClass;

public class Outer {
    void outerMethod(){
        System.out.println("Inside outer method");
        class Inner{
            void innerMethod(){
                System.out.println("inside innerMethod");
            }
        }

        //creating object of inner class
        Inner y = new Inner();

        // Calling over method defined inside it
        y.innerMethod();
    }
}

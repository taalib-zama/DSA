package lambdaExpressions.functionalInterface.userDefinedFunctionalInterface;
@FunctionalInterface
public interface sayable {
    void say(String msg);
    //abstract method-doesn't have its implementation


    // default method
    default void show()
    {
        System.out.println("Default Method Executed");
    }

    //A functional interface can have any number of methods of object class. See in the following exam
    int hashCode();
    @Override
    String toString();
    boolean equals(Object obj);

}

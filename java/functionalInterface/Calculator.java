package functionalInterface;

@FunctionalInterface
public interface Calculator {
    //defining abstract method
    int doOperation(int num1, int num2);

    //defining default method
    default boolean checkValues(int num1, int num2) {
        return (num1>0 && num2>0);
    }

    default int greaterNumber(int num1, int num2){              //can have multiple default/static methods.
        if(num1>num2){
            return num1;
        }
        return num2;
    }
}

package exceptionHandling;

public class Example {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5 };
        int intVar = 0;
        try {
            intVar = intArray[5];
            System.out.println("This is the value of intVar:=" + intVar);// 1
        } catch (ArrayIndexOutOfBoundsException ec) {
            System.out.println("An exception has occurred here:="
                    + ec.getMessage());// 2
        } finally {
            System.exit(-1);
            System.out.println("This is from with in the finally block");// 3
        }
        System.out.println("This will be a part of response");// 4
    }
}

package exceptionHandling;

public class ArithmeticException extends Throwable {
//    public static void divide(int x, int y) {
//        int z = x / y;
//        System.out.println(z);
//    This block will throw a DivideByZero exception. To handle this we need a try-catch block.
    public static void divide(int m, int n) {
        try {
            int p = m/n;
            System.out.println(p);
        }
        catch(java.lang.ArithmeticException ex) {
            System.out.println("The divisor should not be zero");
        }
//        System.out.println(m/n);
}

    public static void main(String[] args) {
        divide(10, 0);
    }
}

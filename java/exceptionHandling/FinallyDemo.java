package exceptionHandling;

public class FinallyDemo {
    public static int divide(int a,int b) {
        return a/b;
    }

    public static void main(String[] args) {
        try {
            divide(9,0);
        } catch (java.lang.ArithmeticException exception) {
            System.out.println("Divide by zero error");
            exception.printStackTrace();
            System.out.println(exception.getMessage());
            System.out.println(exception.toString());
        }
        finally  {
            System.out.println("Inside finally");
        }
    }
}

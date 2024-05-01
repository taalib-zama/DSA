package exceptionHandling;

public class ThrowExample {

    public static void main(String[] args) {
        System.out.println("calling the divide method");
        ThrowExample.divide(23, 0);    // call to method divide not a throw statement.
    }

    public static void divide(int x, int y) {
        try {
            if (y == 0)
                throw new Exception("The divisor should not be zero");
            int z = x % y;
            System.out.println(z);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package exception.handling;

public class PurposeOfCatch {

    public static void main(String[] args) {
        try {
            throwException();
        } catch (RuntimeException ex) {
            ex.printStackTrace();
            System.out.println("Catching Exception happened");
        }
        throwException();
        System.out.println("Exception happened");
    }

    public static void throwException() {
        throw new RuntimeException("Exception Happened");
    }

    /*
    Output:


     */
}

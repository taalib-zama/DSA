package exception.handling;

public class FinallyPurpose {

    public static void main(String[] args) {
        try {
            throwError();
        } catch(Error er) {
            System.exit(420);
        } finally {
            System.out.println("Finally executed");
        }
    }

    public static void throwError() {
        throw new OutOfMemoryError("OOM");
    }
}

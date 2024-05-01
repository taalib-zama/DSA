package exception.handling;

public class SerialOrderOfCatchBlocks {

    public static void main(String[] args) {
        try {
            throwException();
        } catch (RuntimeException | ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Catching Exception happened");
        }
//        throwException();
        System.out.println("Exception happened");
    }

    public static void throwException() throws ClassNotFoundException, RuntimeException {
        throw new RuntimeException("Exception Happened");
    }
}

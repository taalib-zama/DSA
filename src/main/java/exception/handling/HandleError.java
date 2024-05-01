package exception.handling;

public class HandleError {

    public static void main(String[] args) {
        try {
            throwError();
        } catch(Error er) {
            er.printStackTrace();
            System.out.println("Error happened");
        }
    }

    public static void throwError() {
        throw new OutOfMemoryError("OOM");
    }
}

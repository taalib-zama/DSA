package exception.handling;

import java.io.IOException;

public class CatchingUncheckedExceptions {


    /*
    Prevent unchecked exceptions from happening. Ex: Check an object for null so that NPE is not thrown
    Handle checked exceptions by writing try/catch

    Below error has been left intentionally to demonstrate that compiler forces us to handle checked exceptions, whereas it does not do anything for unchecked ones
    Technically, we can write a catch block for unchecked ex also, but as mentioned above, its always a good practice to prevent unchecked ex from happening.
     */
    public static void main(String[] args) {

        throwNPEException();
//        throwException();
        System.out.println("Program complete");
    }

    public static void throwNPEException() throws NullPointerException {
        throw new NullPointerException("NPE");
    }

    public static void throwException() throws IOException {
        throw new IOException("IO");
    }
}

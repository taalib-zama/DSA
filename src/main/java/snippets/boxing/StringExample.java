package snippets.boxing;

public class StringExample {
    // Character constant
    public static final char LETTER_A = 'A';

    // String constant
    public static final String GREETING_MESSAGE = "Hello, world!";

    public static void main(String[] args) {
        System.out.println("Number of bytes occupied by the character constant: " + Character.BYTES);
        System.out.println("Number of bytes occupied by the string constant: " + GREETING_MESSAGE.getBytes().length);
    }
}

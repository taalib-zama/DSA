package FP.exercises;

public class FIrstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";
        char firstNonRepeatingChar = findFirstNonRepeatingChar(str);
        if (firstNonRepeatingChar != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    private static char findFirstNonRepeatingChar(String str) {
        // find the first non-repeating character in the string using streams.
        return str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c)) // Check if the character appears only once
                .findFirst() // Get the first non-repeating character
                .orElse('\0'); // Return null character if none found
    }
}

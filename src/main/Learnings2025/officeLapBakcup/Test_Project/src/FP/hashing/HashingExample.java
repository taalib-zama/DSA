package FP.hashing;
import java.util.HashMap;
import java.util.Hashtable;

public class HashingExample {
    public static void main(String[] args) {
        // Create a Hashtable to store key-value pairs
        Hashtable<Integer, String> hashtable = new Hashtable<>();


        HashMap<Integer, String> hashMap = new HashMap<>();

        // Add key-value pairs to the Hashtable
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");

        // Retrieve a value using its key
        String value = hashtable.get(2);
        System.out.println("Value for key 2: " + value);

        // Print the entire Hashtable
        System.out.println("Hashtable contents: " + hashtable);

        // Check if a key exists
        boolean containsKey = hashtable.containsKey(3);
        System.out.println("Contains key 3: " + containsKey);

        // Remove a key-value pair
        hashtable.remove(1);
        System.out.println("After removing key 1: " + hashtable);
    }
}
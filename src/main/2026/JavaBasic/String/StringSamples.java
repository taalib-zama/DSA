package JavaBasic.String;

import java.util.Arrays;

public class StringSamples {
    public static void main(String[] args) {

        // Inefficient: Creates a new String object in every iteration
        String slowText = "";
        for (int i = 0; i < 5; i++) {
            slowText += i + " ";
        }
        System.out.println("String Result: " + slowText);

        // Efficient: Modifies the same object internally
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            builder.append(i).append(" ");
        }


        System.out.println("================Testing stringbuilder=============");
        // Initialize with a starting string
        StringBuilder message = new StringBuilder("Welcome");

        // Append different data types
        message.append(" to");      // Appends String
        message.append(' ');        // Appends char
        message.append("Java ");    // Appends String
        message.append(25);         // Appends int
        System.out.println("StringBuilder Result: " + builder.toString());

        String[] splitted = message.toString().split(" ");
        System.out.println(Arrays.toString(splitted));

        String test = "This is a sample string";
        System.out.println("Testing substring : " + test.substring(1,3));  //ignore the end index

    }
}

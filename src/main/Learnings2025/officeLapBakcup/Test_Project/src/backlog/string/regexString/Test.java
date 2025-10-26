package backlog.string.regexString;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String input = "";
        try {
            input = new String(Files.readAllBytes(Paths.get("C:\\Users\\VE519NR\\Downloads\\stringtestcase6.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        solve(input);
    }

    public static void solve(String s) {
        // Split the string into tokens using the given regular expression
        String[] tokens = s.trim().split("[^A-Za-z]+");

        tokens= Arrays.stream(tokens).filter(token -> !token.isEmpty()).toArray(String[]::new);
        // Print the number of tokens
        System.out.println(tokens.length);

        // Print each token on a new line
        for (String token : tokens) {
            System.out.println(token);

        }
    }


}



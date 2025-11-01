package officeLapBakcup.Test_Project.src;

import java.io.*;
import java.nio.file.*;
import java.util.regex.*;

public class SQLReplacer {
    public static void main(String[] args) {
        // The path to the original SQL script file
        Path inputFilePath = Paths.get("C:\\Users\\VE519NR\\Downloads\\dev_sql_script.txt");
        // The path to the new SQL script file with updated IDs
        Path outputFilePath = Paths.get("C:\\Users\\VE519NR\\Downloads\\dev_sql_script_updated.txt");

        // The new starting ID you want to use
        int newStartId = 2250792;

        // Read the original SQL script
        try {
            String scriptContent = new String(Files.readAllBytes(inputFilePath));
            // Use regular expression to find and replace the IDs
            Pattern pattern = Pattern.compile("VALUES\\((\\d+),");
            Matcher matcher = pattern.matcher(scriptContent);
            StringBuffer sb = new StringBuffer();

            while (matcher.find()) {
                matcher.appendReplacement(sb, "VALUES(" + newStartId++ + ",");
            }
            matcher.appendTail(sb);

            // Write the updated script to a new file
            Files.write(outputFilePath, sb.toString().getBytes());
            System.out.println("The updated SQL script has been saved to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package DateTimeAPI.convert24hr;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static String englishTime(String input) throws ParseException
        {

            // Format of the date defined in the input String
            DateFormat dateFormat
                    = new SimpleDateFormat("hh:mm:ssaa");

            // Change the pattern into 24 hour format
            DateFormat format
                    = new SimpleDateFormat("HH:mm:ss");
            Date time = null;
            String output = "";

            // Converting the input String to Date
            time = dateFormat.parse(input);

            // Changing the format of date
            // and storing it in
            // String
            output = format.format(time);
            return output;
        }

}

package DateTimeAPI.convert24hr;

import java.text.ParseException;

public class Tester {
    public static void main(String[] args) throws ParseException {
            String input = "07:05:45PM";
        System.out.println(Solution.englishTime(input));
    }
}

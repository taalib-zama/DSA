package DateTimeAPI.Exercise1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the DOB in format dd/mm/yyyy : ");
//        String DOB = in.next();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate DOB1 = LocalDate.parse(in.next(), df);
        System.out.println("Date in default format : " +DOB1);  //to format date and create a localdate with input string
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Date : " +df2.format(DOB1));
        LocalDate now = LocalDate.now();
        System.out.println("You are " + ChronoUnit.YEARS.between(DOB1, now) + " years, " +
                ChronoUnit.MONTHS.between(DOB1,now) + " months and " + ChronoUnit.DAYS.between(DOB1, now) + " days old.");


    }
}

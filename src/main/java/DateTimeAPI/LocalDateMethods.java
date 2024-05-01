package DateTimeAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateMethods {
    public static void main(String[] args) {
        //printing today's date - uses static method of LocalDate class.
        LocalDate today = LocalDate.now();
        System.out.println(today);


        //* To display any date in default format we use of() method.
        // of() takes parameters as public static LocalDate of(int year,Month month,int dayOfMonth)(where Month is enum)
        // OR we use method public static LocalDate of(int year,int month,int dayOfMonth)
        // This returns a LocalDate with the specified year, month and day-of-month

        System.out.println("LocalDate.of(2018, 8, 29) :- "+LocalDate.of(2018, 8, 29));
        System.out.println("LocalDate.of(2017,Month.APRIL, 29) :- "+LocalDate.of(2017, Month.APRIL, 29));


        //To access the date information we have certain methods like getYear(),getMonth(),getDayOfMonth() etc.
        LocalDate date = LocalDate.parse("13 Feb, 2020", DateTimeFormatter.ofPattern("dd MMM, yyyy"));
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
        System.out.println("Input Format is 13 Feb, 2020 \nOutput Format :-  "+date);


        //.format() method formats the date according to user defined pattern.
        String dateString = date.format(DateTimeFormatter.ofPattern("dd/MMM/uuuu"));
        System.out.println("Formatte date in format dd/MMM/yyyy : " +dateString);

        //The DateTimeFormatter class in Java is used for parsing dates in different formats.
        //			- ofPattern method will create a formatter based on the pattern given by the programmer.
        //			  For example, d MMM yyyy will format 2011-12-03 as '3 Dec 2011'.
        System.out.println("************"+"Functions to access date information"+"************");
        System.out.println("Today's Date :- "+LocalDate.now());
        System.out.println("Month in Today's Date :- "+LocalDate.now().getMonth());
        System.out.println("What is the current year going on .... ? :- "+LocalDate.now().getYear());
        System.out.println("Which day is today ? :- "+LocalDate.now().getDayOfWeek());

        //the above methods getDayOfWeek() & getMonth() :- returns an enum instead of int value.
        //			To get int value, we can use getValue() methods
        System.out.println("Month in Today's Date :- "+LocalDate.now().getMonth().getValue());
        System.out.println("Which day is today ? :- "+LocalDate.now().getDayOfWeek().getValue());

        //*************************************************************************************//

        //***Following are methods for localdate calculations
        //			plusDays(),plusWeeks(),plusMonths(),plusYears(),minusDays(),minusWeeks(),minusMonths,()minusYears()
        //			All of these methods take parameters having Long datatype
        System.out.println();
        System.out.println("************"+"LocalDate Calculations"+"************");
        System.out.println("Today's Date :- "+LocalDate.now());
        System.out.println("Date after 7 days ?	 => "+LocalDate.now().plusDays(7));
        System.out.println("Date after 7 months ?	 => "+LocalDate.now().plusMonths(7));
        System.out.println("Date after 7 Years ?	 => "+LocalDate.now().plusYears(7));
        System.out.println("Date after 7 weeks ?	 => "+LocalDate.now().plusWeeks(7));
        System.out.println("Date before 20 days ago : " +LocalDate.now().minusDays(20));

        ///********************************************************************************************

        //difference of dates using CHRONOUNIT.
        LocalDate todayObj = LocalDate.now();
        LocalDate date1 = LocalDate.of(2014,5,25);
        System.out.println("Difference between todayObj and date1(in terms of Number of Days) :- " +
                ""+date1.until(todayObj, ChronoUnit.DAYS));

//************************************************************************************************************
        /*
			To Compare two dates we also have compareTo() method
			Method Signature of compareTo() :- int compareTo(chronoLocalDate date)

			It returns the value 0 if the argument Date is equal to this Date.
			It returns a value less than 0 if this Date is before the Date argument.
			It returns a value greater than 0 if this Date is after the Date argument.

			Try Comparing today's date with date1 using compareTo()
		*/
        System.out.println();
        System.out.println("************"+"isAfter() and isBefore()"+"************");
        LocalDate dateFirst = LocalDate.of(2018, 2,21);
        LocalDate dateSecond = LocalDate.of(2018, 2,20);

        System.out.println("dateFirst.isBefore(dateSecond) :- "+dateFirst.isBefore(dateSecond));
        System.out.println("dateFirst.isAfter(dateSecond) :- "+dateFirst.isAfter(dateSecond));
    }
}

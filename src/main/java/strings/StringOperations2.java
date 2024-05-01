package strings;

import java.util.stream.Stream;

public class StringOperations2 {
    //some new methods of String introduced in Java 11. Some of these methods like repeat(), isBlank(), strip(),
    // stripLeading(), stripTrailing(), lines() are discussed in the tryout.
    public static void main(String[] args) {

        System.out.println();
        System.out.println("------------"+"Java 11 String methods"+"------------");
        String one = "amazon";
        System.out.println("Repeat method used to repeat the string having count passed as parameter");
        System.out.println("Repeat string one 3 times :-"+one.repeat(3));

        System.out.println();
        String two = "Antarctica";
        System.out.println("isBlank() tells us whether the string contains only Blank spaces");
        System.out.println("Checking isBlank() with string two :- "+two.isBlank());
        String blank="     ";
        System.out.println("Checking isBlank() with string blank :- "+blank.isBlank());

        System.out.println();
        String whiteSpaceLeadingAndTrailing = "   Pacific  ";
        String whiteSpaceLeading = "   Pacific";
        String whiteSpaceTrailing = "Pacific    ";

        System.out.println("In Java 11, we have three methods to remove extra white-spaces\n"
                + "1.strip() => All the leading and trailing white-spaces are removed.\n"
                + "2.stripLeading() => All the leading white-spaces are removed.\n"
                + "3.stripTrailing() => All the trailing white-spaces are removed.\n"
                + "These methods are extension to the trim() method which we have already seen\n");

        System.out.println("----Demo----");
        System.out.println("Using strip() :- "+whiteSpaceLeadingAndTrailing.strip());
        System.out.println("Using stripLeading() :- "+whiteSpaceLeading.stripLeading());
        System.out.println("Using stripTrailing() :- "+whiteSpaceTrailing.stripTrailing());

        System.out.println();
        System.out.println("String.lines() splits the string by its line terminators and returns a Stream of Strings");
        String str1 = "A \n B \n C \n D";
        System.out.println("Use String.lines() on string str1");
        Stream<String> lines = str1.lines();
        lines.forEach(System.out::println);
    }
}

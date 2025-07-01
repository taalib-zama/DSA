package javaBasics.Annotations;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void printLogvalues(List<Integer>... logNumbers){
        Object[] logNumbersArray = logNumbers;
        List<String> stringValuesList = new ArrayList<>();
        stringValuesList.add("Log Values: ");
        logNumbersArray[0] = stringValuesList;
    }

    public static void main(String[] args) {
        List<Integer> logNumbers = new ArrayList<>();
        logNumbers.add(1);
        logNumbers.add(2);
        logNumbers.add(3);

        // Calling the method with varargs
        printLogvalues(logNumbers);

        // Printing the log numbers
        System.out.println("Log Numbers: " + logNumbers);
    }
}

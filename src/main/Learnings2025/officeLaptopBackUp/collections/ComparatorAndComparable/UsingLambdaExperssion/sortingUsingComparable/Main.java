package officeLaptopBackUp.collections.ComparatorAndComparable.UsingLambdaExperssion.sortingUsingComparable;

import officeLaptopBackUp.collections.ComparatorAndComparable.UsingLambdaExperssion.sortingUsingComparable.Answers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Sample data
        List<Answers> answerToBeUpdate = new ArrayList<>();
        answerToBeUpdate.add(new Answers("Answer 1", "1",LocalDateTime.of(2023, 10, 1, 10, 0)));
        answerToBeUpdate.add(new Answers("Answer 2", "2",LocalDateTime.of(2023, 9, 15, 12, 30)));
        answerToBeUpdate.add(new Answers("Answer 3", "3",LocalDateTime.of(2023, 10, 5, 8, 45)));

        // Sorting the list using Comparable
        Collections.sort(answerToBeUpdate);

        // Printing the sorted list
        answerToBeUpdate.forEach(System.out::println);
    }
}
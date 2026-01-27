package officeLaptopBackUp.collections.ComparatorAndComparable.UsingLambdaExperssion.sortingUsingComaparator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Sample data
        List<Answers> answerToBeUpdate = new ArrayList<>();
        answerToBeUpdate.add(new Answers("Answer 1", LocalDateTime.of(2023, 10, 1, 10, 0)));
        answerToBeUpdate.add(new Answers("Answer 2", LocalDateTime.of(2023, 9, 15, 12, 30)));
        answerToBeUpdate.add(new Answers("Answer 3", LocalDateTime.of(2023, 10, 5, 8, 45)));



        // You can add your code here to demonstrate sorting using lambda expressions
        List<Answers> answerUpdateFilterOnDates = answerToBeUpdate
                .stream()
                .sorted(Comparator.comparing(AbstractEntity::getUpdatedDate).reversed())
                .toList();


        // Printing the sorted list
        answerUpdateFilterOnDates.forEach(System.out::println);
    }
}

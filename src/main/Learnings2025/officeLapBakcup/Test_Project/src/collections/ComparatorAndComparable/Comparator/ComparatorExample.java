package collections.ComparatorAndComparable.Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 85.5),
                new Student("Bob", 90.0),
                new Student("Charlie", 85.5)
        );

        // Sort by grade, then by name
        students.sort(Comparator.comparingDouble(Student::getGrade)
                .thenComparing(Student::getName));

        System.out.println(students);
    }
}

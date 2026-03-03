package collections.ComparatorAndComparable.Comparator;

import java.util.Comparator;

public class GradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGrade(), s2.getGrade());
    }
}

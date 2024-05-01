package collections.arrayListIteration;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Tester {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1001, "Steve", true));
        studentList.add(new Student(1002, "Rachel", false));
        studentList.add(new Student(1003, "Monica", true));
        studentList.add(new Student(1004, "David", true));

        List<String> studentNames = new ArrayList<String>();
        // Iteration of the studentList using for-each loop
//        for (Student student : studentList) {
//            studentNames.add(student.getStudentName());
//            System.out.println("Student ID : " + student.getStudentId());
//            System.out.println("Student Name : " + student.getStudentName());
//            System.out.println("Course Registered : " + student.getCourseRegistered());
//        }
//        System.out.println("Student Names : " + studentNames);
        //using list iterator.

        ListIterator<Student> itr = studentList.listIterator();

        System.out.println("Display the student names");
        while (itr.hasNext()) {
            System.out.println(itr.next().getStudentName());
        }

        System.out.println("Display the student names in reverse order");
        while (itr.hasPrevious()) {
            System.out.println(itr.previous().getStudentName());
        }

    }
}

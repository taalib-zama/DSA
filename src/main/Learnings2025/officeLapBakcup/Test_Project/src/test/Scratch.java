package test;

import backlog.Java8.functionalInterface.data.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Scratch {

    public static void main(String[] args) {
        List<Students> students  = new ArrayList<Students>();

        // get list of names of any 10 students born after 1st Feb 2010
        // names should be sorted in descending order
        // names should be returned in UPPERCASE

        students.stream().filter(student -> student.getDob().isAfter(LocalDate.of(2010,02,01))).
                map(student -> student.getName().toUpperCase());

    }
}

package collections.sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Vijay");
        set.add("Ajay");
        set.add("Ravi");
        set.add("Sanjay");
        set.add("Ravi");
//        for(String name: set){
//            System.out.println(name);
//        }
        //usig stream to print.
        System.out.println("using stream to print the set");
        set.stream().forEach(System.out::println);


        System.out.println("Size:"+set.size());
        System.out.println(set.contains("Ajay"));
        System.out.println(set.contains("Shashi"));


        Set<Student> students = new TreeSet<>();
        students.add(new Student("3", "Rakesh", 99));
        students.add(new Student("4", "Rahul", 89));
        students.add(new Student("2", "Rani", 91));
        students.add(new Student("1", "Ravi", 95));
        students.add(new Student("1", "Ravi", 95));
        for(Student student: students){
            System.out.println(student);
        }

    }
}

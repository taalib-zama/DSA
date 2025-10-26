package backlog.Java8.functionalInterface.consumer;

import backlog.Java8.functionalInterface.data.Student;
import backlog.Java8.functionalInterface.data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //implementqtion of lambda expression
        Consumer<String> c1 = (s)-> System.out.println(s.toUpperCase());
        //passing input to lambda expression.
        c1.accept("java8");
        // call to user defined functional interface,
        //printName();


        //sample of consumer interface
        Consumer<Integer> display = a -> System.out.println(a);

        // Implement display using accept()
        display.accept(10);



        //consumer to  multiply 2 to every integer in list.
        Consumer<List<Integer>> modify = listProvided ->
            /*for (int i = 0; i < listProvided.size(); i++) {
                listProvided.set(i, 2 * listProvided.get(i));
            }*/
            listProvided.stream().forEach(element -> element = element * 2);


            //consumer to display the number.
        Consumer<List<Integer> >
                dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));


        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);

    };


    public static void printName(){
        //implement consumer interface for sudent class.
        Consumer<Student> c2 = (student) -> System.out.println(student);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }
}

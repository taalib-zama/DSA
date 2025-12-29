package backlog.Java8.functionalInterface.consumer;

import backlog.Java8.functionalInterface.data.Student;
import backlog.Java8.functionalInterface.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){

        BiConsumer<String, List<String>> biConsumerStudent = (name,activities) ->{
            System.out.println("name : "+name + "," +"Activities" + activities);
        };
        List<Student> listStudents = StudentDataBase.getAllStudents();
        listStudents.forEach((student -> biConsumerStudent.accept(student.getName(), student.getActivities())));
    }



    public static void main(String[] args) {
        //biconsumer method implementation
        BiConsumer<String, String> biConsumer = (a ,b) -> {
            System.out.println("a : " +a);
            System.out.println("b : " +b);
        };
        //passing input for biconsumer method.
        biConsumer.accept("java7", "java8");



        //consumer interface returns noting
        BiConsumer<Integer, Integer> multiply = (a,b) ->{
            System.out.println("Multiplication is : "+a*b);
        };
        BiConsumer<Integer, Integer> divide = (a,b) ->{
            System.out.println("Division is : "+a/b);
        };

        //using 2 consumers with andThen method.
        multiply.andThen(divide).accept(9,3);

        //calling biconsumer for student method
        nameAndActivities();
    }
}

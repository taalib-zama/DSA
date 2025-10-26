package Streams.interviewProblems;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ToDoList> todos = new ArrayList<>();

        //add dummy data
        ToDoList todo1 = new ToDoList();
        todo1.setId(1);
        todo1.setTitle("Learn Java");
        todo1.setContent("Complete Java Basics");
        todo1.setStatus("Pending");
        todos.add(todo1);
        ToDoList todo2 = new ToDoList();
        todo2.setId(2);
        todo2.setTitle("Learn Spring");
        todo2.setContent("Complete Spring Boot");
        todo2.setStatus("In Progress");
        todos.add(todo2);
        ToDoList todo3 = new ToDoList();
        todo3.setId(3);
        todo3.setTitle("Learn Docker");
        todo3.setContent("Complete Docker Basics");
        todo3.setStatus("Completed");
        todos.add(todo3);

        ToDoList toBeUpdated = new ToDoList();
        toBeUpdated.setId(35);
        toBeUpdated.setTitle("Learn Docker and Kubernetes");
        toBeUpdated.setContent("Complete Docker and Kubernetes Basics");
        toBeUpdated.setStatus("In Progress");


        //to write a single opration to find the todo by id from list of todos and update it using streams

        System.out.println("Before update: " + todos);

        UpdateTodo.updateTodo(3,toBeUpdated, todos);

        System.out.println("After update: " + todos);




    }
}

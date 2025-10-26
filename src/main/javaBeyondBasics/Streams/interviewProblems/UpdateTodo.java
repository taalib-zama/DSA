package Streams.interviewProblems;

import java.util.List;

public class UpdateTodo {
    public static ToDoList updateTodo(int id, ToDoList updatedTodo, List<ToDoList> todoList) {
        //to write a single opration to find the todo by id from list of todos and update it using streams

        return todoList.stream()
                .filter(todo -> todo.getId() == id)
                .findFirst()
                .map(existingTodo -> {
                    existingTodo.setTitle(updatedTodo.getTitle());
                    existingTodo.setContent(updatedTodo.getContent());
                    existingTodo.setStatus(updatedTodo.getStatus());
                    return existingTodo;
                })
                .orElseThrow(() -> new TodoNotFoundException(id));

    }
}

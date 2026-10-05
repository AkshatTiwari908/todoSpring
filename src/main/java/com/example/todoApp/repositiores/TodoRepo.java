package com.example.todoApp.repositiores;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.todoApp.schema.Todo;

import java.util.ArrayList;

@Component 
public class TodoRepo {
    private List<Todo> todoData = new ArrayList<>();

    TodoRepo(){
        todoData.add(new Todo(1,"Bath"));
        todoData.add(new Todo(2,"Gym"));
        todoData.add(new Todo(3,"Sleep"));
    }
   
    public List<Todo> getAllTodos(){
        return todoData;
    }

}

package com.example.todoApp.services;
import org.springframework.stereotype.Service;

import com.example.todoApp.repositiores.*;
import com.example.todoApp.schema.*;

import java.util.List;


@Service 
public class TodoService {
    private TodoRepo todo_repo;

    TodoService(TodoRepo todo_repo){
        this.todo_repo = todo_repo;
    }
    public List<Todo> handleLogic(){
       return todo_repo.getAllTodos();
    }
    
    public void addTodoLogic(int id, String desc){
       todo_repo.addTodoRepo(id, desc);
    }

    public void deleteToDoLogic(int id){
        todo_repo.deleteTodo(id);
    }

    public void updateTodoLogic(int id, String desc){
        todo_repo.UpdateTodo(id, desc);
    }
}

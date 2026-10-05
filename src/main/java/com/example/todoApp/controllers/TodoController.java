package com.example.todoApp.controllers;
import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.todoApp.schema.*;
import com.example.todoApp.services.TodoService;


@RestController 
public class TodoController{

    private TodoService todo_service;

    TodoController(TodoService todo_service){
        this.todo_service = todo_service;
    }
   
    @GetMapping("/todos")
    public List<Todo> getAllTodos(){
        return todo_service.handleLogic();
    }

    @PostMapping("/addTodo")
    public String addTodo(@RequestBody Todo newtodo){
           try {
            todo_service.addTodoLogic(newtodo.getId(), newtodo.getDesc());
            return ("Entry Suceeded");
           } catch (Exception e) {
             System.out.println(e.getMessage());
             return ("Failure Occured");
           }
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTodo(@PathVariable int id){
        try {
            todo_service.deleteToDoLogic(id);
            return ("Deletion Suceeded");
        } catch (Exception e) {   
            System.out.println(e.getMessage());
            return ("Failure Occured");
        }
    }

    @PutMapping("/update")
    public String UpdateTodo(@RequestBody Todo todo){
         try {
            todo_service.updateTodoLogic(todo.getId(), todo.getDesc());
            return ("Update Suceeded");
        } catch (Exception e) {   
            System.out.println(e.getMessage());
            return ("Failure Occured");
        }
    }     
    
}
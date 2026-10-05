package com.example.todoApp.controllers;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;

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
}
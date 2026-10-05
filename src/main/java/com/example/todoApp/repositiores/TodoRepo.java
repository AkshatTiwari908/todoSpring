package com.example.todoApp.repositiores;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.todoApp.schema.Todo;

import java.util.ArrayList;

@Repository 
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

    public void addTodoRepo(int id, String desc){
        todoData.add(new Todo(id,desc));
    }
    
    public void deleteTodo(int id){
        todoData.removeIf(todo -> todo.getId() == id); 
    }
    
    public void UpdateTodo(int id, String newDesc){
       for(int i=0; i<todoData.size(); i++){
        if(todoData.get(i).getId() == id){
            todoData.get(i).setDesc(newDesc);
        }
       }
    }

}

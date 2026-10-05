package com.example.todoApp.schema;

public class Todo {
   private final int id;
   private String desc;

   public Todo(int id, String desc){
    this.id = id;
    this.desc = desc;
   }

   public int getId() {
      return id;
   }

   public String getDesc() {
      return desc;
   }
   
   public void setDesc(String desc){
      this.desc = desc;
   }
}

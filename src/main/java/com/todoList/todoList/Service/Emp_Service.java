package com.todoList.todoList.Service;

import com.todoList.todoList.Entity.Emp_Entity;

import java.util.List;

public interface Emp_Service {
    List<Emp_Entity> getAllTodo();


    void deleteTodoById(Long id);

    void addingNewTodo(Emp_Entity emp_entity);
}

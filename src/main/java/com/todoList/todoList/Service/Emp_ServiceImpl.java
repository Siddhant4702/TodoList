package com.todoList.todoList.Service;

import com.todoList.todoList.Entity.Emp_Entity;
import com.todoList.todoList.Repository.Emp_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Emp_ServiceImpl implements Emp_Service{

    @Autowired
    private Emp_Repository emp_repository;

    @Override
    public List<Emp_Entity> getAllTodo() {
        return emp_repository.findAll();
    }

    @Override
    public void deleteTodoById(Long id) {
        this.emp_repository.deleteById(id);
    }

    @Override
    public void addingNewTodo(Emp_Entity emp_entity) {
        this.emp_repository.save(emp_entity);
    }

}

package com.todoList.todoList.Repository;

import com.todoList.todoList.Entity.Emp_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Emp_Repository extends JpaRepository<Emp_Entity ,Long> {
}

package com.todoList.todoList.Controller;

import com.todoList.todoList.Entity.Emp_Entity;
import com.todoList.todoList.Service.Emp_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Emp_Controller {

    @Autowired
    private Emp_Service emp_service;
    @GetMapping("/")
    public  String getAllTodoForToday(Model model){
        model.addAttribute("list", emp_service.getAllTodo());
        return "Home";
    }

    @GetMapping("/addNewTask")
    public String addNewTask(Model model){
        Emp_Entity emp_entity=new Emp_Entity();
        model.addAttribute("list", emp_entity);
        return "newtask";
    }
    @PostMapping("/newtodo")
    public  String newtodo(@ModelAttribute("emp_entity")Emp_Entity emp_entity){
        emp_service.addingNewTodo(emp_entity);
        return "redirect:/";
    }


    @GetMapping("/deleteTodo/{id}")
    public  String deleteTodo(@ModelAttribute(name = "id")Long id){
         emp_service.deleteTodoById(id);
         return "redirect:/";
    }


}

package com.rasya.todo_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rasya.todo_app.entity.Task;
import com.rasya.todo_app.service.TaskService;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/tasks")
@CrossOrigin("*")
public class TaskController {
    
    @Autowired
    private TaskService taskService;

    @GetMapping()
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping()
    public Task createTask(@RequestBody Task task) {
        //TODO: process POST request
        
        return taskService.saveTask(task);
    }
    
    
}

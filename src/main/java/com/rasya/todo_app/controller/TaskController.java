package com.rasya.todo_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rasya.todo_app.entity.Task;
import com.rasya.todo_app.service.TaskService;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




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

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    @PostMapping()
    public Task createTask(@RequestBody Task task) {
        //TODO: process POST request
        
        return taskService.saveTask(task);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) 
    {
        taskService.deleteTask(id);

        return "Task berhasil dihapus!";
    }
    
    
}

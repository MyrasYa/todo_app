package com.rasya.todo_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rasya.todo_app.entity.Task;
import com.rasya.todo_app.repository.TaskRepository;

@Service
public class TaskService {
    
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    
}

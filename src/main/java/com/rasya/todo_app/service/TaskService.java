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

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public Task updateTask(Long id, Task newTask) {
        Task task = taskRepository.findById(id).orElse(null);

        if (task != null) {
            task.setTitle(newTask.getTitle());
            task.setDescription(newTask.getDescription());
            task.setCompleted(newTask.isCompleted());

            return taskRepository.save(task);

        }

        return null;

    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}

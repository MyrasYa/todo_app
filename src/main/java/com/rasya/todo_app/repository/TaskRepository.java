package com.rasya.todo_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rasya.todo_app.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> { 

}




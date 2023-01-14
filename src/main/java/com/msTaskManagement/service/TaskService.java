package com.msTaskManagement.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msTaskManagement.model.TaskEntity;
import com.msTaskManagement.repository.TaskRepository;

@Service
public class TaskService implements TaskServiceInterface {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public List<TaskEntity> findAll() {
        
        return taskRepository.findAll();
    }

    @Override
    public TaskEntity createNewTask(TaskEntity task) {
        task.setCreationDate(LocalDateTime.now());
        return taskRepository.save(task);
    }

    @Override
    public TaskEntity deleteTaskById(Long taskId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<TaskEntity> findByStatus(String status) {
        // TODO Auto-generated method stub
        return null;
    }
    
}

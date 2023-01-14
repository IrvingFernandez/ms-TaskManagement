package com.msTaskManagement.service;

import java.util.List;

import com.msTaskManagement.model.TaskEntity;

public interface TaskServiceInterface {
    
    List<TaskEntity> findAll();

    TaskEntity createNewTask(TaskEntity task);

    TaskEntity deleteTaskById(Long taskId);

    List<TaskEntity> findByStatus(String status);

    
}

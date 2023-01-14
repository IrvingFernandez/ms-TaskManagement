package com.msTaskManagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msTaskManagement.model.TaskEntity;
import com.msTaskManagement.service.TaskService;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping
    public ResponseEntity<?> saveTask(@RequestBody TaskEntity taskEntity){

        return new ResponseEntity<>(taskService.createNewTask(taskEntity), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAll(){

        return ResponseEntity.ok(taskService.findAll());
    }
    
}

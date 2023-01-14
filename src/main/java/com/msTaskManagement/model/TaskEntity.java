package com.msTaskManagement.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "task")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;

    @Column(name = "task_title", nullable = false)
    private String title;

    @Column(name = "task_description", nullable = false)
    private String description;

    @Column(name = "task_creation_date", nullable = false)
    private LocalDateTime creationDate;

    @Column(name = "task_completion_Date", nullable = true)
    private String completionDate;
    
    @Column(name="task_completed", nullable = false)
    private String completed;

    @Column(name = "task_status", nullable = false)
    private String status;


    
    
}

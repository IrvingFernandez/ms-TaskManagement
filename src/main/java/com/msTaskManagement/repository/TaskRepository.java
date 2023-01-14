package com.msTaskManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msTaskManagement.model.TaskEntity;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long>{
    
}

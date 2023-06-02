package com.example.datang.demos.service;

import com.example.datang.demos.entity.Task;

import java.util.List;

public interface TaskService {
    public List<Task> findTaskAll();

    public List<Task> findTaskByName(String username);

    public List<Task> findTaskUndone(String username,String taskCondition);

    public Task findTaskById(Integer id);

    public void addTask(Task task);
    public void editTask(Task task);

    public void delTask(Integer id);
}

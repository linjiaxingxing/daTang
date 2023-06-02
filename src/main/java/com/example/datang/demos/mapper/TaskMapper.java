package com.example.datang.demos.mapper;

import com.example.datang.demos.entity.Task;

import java.util.List;

public interface TaskMapper {
    /**
     * 查询所有任务
     * @return
     */
    public List<Task> findTaskAll();

    /**
     * 根据主管的username查询 该主管创建的所有任务
     * @param username
     * @return
     */
    public List<Task> findTaskByName(String username);

    /**
     * 根据任务状态查询 未实施的任务
     * @param username
     * @param taskCondition
     * @return
     */
    public List<Task> findTaskUndone(String username,String taskCondition);

    /**
     * 根据任务id查询任务（跳转页面时没有携带json数据，携带id查询）
     * @param id
     * @return
     */
    public Task findTaskById(Integer id);

    public void addTask(Task task);
    public void editTask(Task task);
    public void delTask(Integer id);
}

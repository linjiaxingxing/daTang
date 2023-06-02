package com.example.datang.demos.service.impl;

import com.example.datang.demos.entity.Task;
import com.example.datang.demos.mapper.TaskMapper;
import com.example.datang.demos.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskMapper taskMapper;

    /**
     * 查询所有任务
     *
     * @return
     */
    @Override
    public List<Task> findTaskAll() {
        return taskMapper.findTaskAll();
    }

    /**
     * 根据主管的username查询 该主管创建的所有任务
     *
     * @param username
     * @return
     */
    @Override
    public List<Task> findTaskByName(String username) {
        return taskMapper.findTaskByName(username);
    }

    /**
     * 根据任务状态查询 未实施的任务
     *
     * @param username
     * @param taskCondition
     * @return
     */
    @Override
    public List<Task> findTaskUndone(String username, String taskCondition) {

        System.out.println("service层的参数：" + username);
        return taskMapper.findTaskUndone(username, taskCondition);
    }

    /**
     * 根据任务id查询任务（跳转页面时没有携带json数据，携带id查询）
     *
     * @param id
     * @return
     */
    @Override
    public Task findTaskById(Integer id) {
        return taskMapper.findTaskById(id);
    }

    @Override
    public void addTask(Task task) {
        taskMapper.addTask(task);
    }

    @Override
    public void editTask(Task task) {
        taskMapper.editTask(task);
    }

    @Override
    public void delTask(Integer id) {
        taskMapper.delTask(id);
    }
}

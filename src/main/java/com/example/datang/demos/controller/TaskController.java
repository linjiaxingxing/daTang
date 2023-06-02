package com.example.datang.demos.controller;

import com.example.datang.demos.entity.Task;
import com.example.datang.demos.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("task")
public class TaskController {

    @Autowired
    TaskService ts;

    /**
     * 查询所有任务
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/findAll")
    public List<Task> findTaskAll() {
        return ts.findTaskAll();
    }

    /**
     * 根据主管的username查询 该主管创建的所有任务
     *
     * @param username 任务发布人姓名
     * @return
     */
    @ResponseBody
    @RequestMapping("/findTaskByName")
    public List<Task> findTaskByName(@RequestParam("username") String username) {
        return ts.findTaskByName(username);
    }


    /**
     * 根据任务状态查询 未实施的任务
     *
     * @param username      发布人姓名，当前登录的主管名
     * @param taskCondition 任务状态，默认为：未实施
     * @return
     */
    @ResponseBody
    @RequestMapping("/findTaskUndone")
    public List<Task> findTaskUndone(@RequestParam("username") String username,
                                     @RequestParam("taskCondition") String taskCondition) {
        System.out.println(username + "====" + taskCondition);
        return ts.findTaskUndone(username, taskCondition);
    }


    /**
     * 根据任务id查询任务（跳转页面时没有携带json数据，携带id查询）
     *
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/findTaskById")
    public Task findTaskById(@RequestParam("id") Integer id) {
        System.out.println(ts.findTaskById(id));
        return ts.findTaskById(id);
    }


    /**
     * 增加新的任务
     *
     * @param task
     */
    @RequestMapping("/addTask")
    public void addTask(@RequestBody Task task) {
        ts.addTask(task);
    }


    /**
     * 编辑任务
     *
     * @param task
     */
    @RequestMapping("/editTask")
    public void editTask(@RequestBody Task task) {
        System.out.println(task);
        ts.editTask(task);
    }


    /**
     * 根据id删除任务
     *
     * @param id
     */
    @RequestMapping("/delTask")
    public void delTask(@RequestParam("id") Integer id) {
        ts.delTask(id);
    }
}

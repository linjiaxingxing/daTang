package com.example.datang.demos.mapper;

import com.example.datang.demos.entity.Plan;
import com.example.datang.demos.entity.Task;

import java.util.List;

public interface PlanMapper {

    /**
     * 根据任务id，查询该任务所属下的 全部计划
     * @param id
     * @return
     */
    public List<Plan> findPlanByTaskId(Integer id);

    /**
     * 根据登录的员工username查询，实施人为该员工的所有任务
     * @param username
     * @return
     */
    public List<Task> findPlanByUsername(String username);

    /**
     * 根据id查询计划
     * @param id
     * @return
     */
    public Plan findPlanById(Integer id);

    /**
     * 编辑计划
     * @param plan
     */
    public void editPlan(Plan plan);

    /**
     * 新建计划
     * @param plan
     */
    public void addPlan(Plan plan);

    /**
     * 删除计划
     * @param id
     */
    public void delPlan(Integer id);

    public List<Plan> findPlanSubsume(Plan plan);
}

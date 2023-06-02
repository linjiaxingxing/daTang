package com.example.datang.demos.service.impl;

import com.example.datang.demos.entity.Plan;
import com.example.datang.demos.entity.Task;
import com.example.datang.demos.mapper.PlanMapper;
import com.example.datang.demos.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Autowired
    PlanMapper planMapper;

    /**
     * 根据任务id，查询该任务所属下的 全部计划
     * @param id
     * @return
     */
    @Override
    public List<Plan> findPlanByTaskId(Integer id) {
        return planMapper.findPlanByTaskId(id);
    }

    /**
     * 根据登录的员工username查询，实施人为该员工的所有任务
     * @param username
     * @return
     */
    @Override
    public List<Task> findPlanByUsername(String username) {
        return planMapper.findPlanByUsername(username);
    }

    /**
     * 根据id查询计划
     * @param id
     * @return
     */
    @Override
    public Plan findPlanById(Integer id) {
        return planMapper.findPlanById(id);
    }

    /**
     * 编辑计划
     * @param plan
     */
    @Override
    public void editPlan(Plan plan) {
        planMapper.editPlan(plan);
    }

    @Override
    public void addPlan(Plan plan) {
        planMapper.addPlan(plan);
    }

    @Override
    public void delPlan(Integer id) {
        planMapper.delPlan(id);
    }

    /**
     * 根据筛选条件组合，查询计划
     * @param plan
     * @return
     */
    @Override
    public List<Plan> findPlanSubsume(Plan plan) {
        return planMapper.findPlanSubsume(plan);
    }
}

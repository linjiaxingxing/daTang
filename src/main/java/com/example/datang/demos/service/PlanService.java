package com.example.datang.demos.service;

import com.example.datang.demos.entity.Plan;
import com.example.datang.demos.entity.Task;

import java.util.List;

public interface PlanService {
    public List<Plan> findPlanByTaskId(Integer id);

    public List<Task> findPlanByUsername(String username);

    public Plan findPlanById(Integer id);

    public void editPlan(Plan plan);

    public void addPlan(Plan plan);

    public void delPlan(Integer id);

    public List<Plan> findPlanSubsume(Plan plan);

}

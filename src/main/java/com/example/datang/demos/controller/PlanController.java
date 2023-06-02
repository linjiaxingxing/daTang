package com.example.datang.demos.controller;

import com.example.datang.demos.entity.Plan;
import com.example.datang.demos.entity.Task;
import com.example.datang.demos.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plan")
public class PlanController {

    @Autowired
    PlanService ps;

    /**
     * 根据任务id，查询该任务所属下的 全部计划
     *
     * @param id 上级任务id
     * @return 计划的集合
     */
    @ResponseBody
    @RequestMapping("/findPlanByTaskId")
    public List<Plan> findPlanByTaskId(@RequestParam("id") Integer id) {
        System.out.println(ps.findPlanByTaskId(id));
        return ps.findPlanByTaskId(id);
    }


    /**
     * 根据登录的员工username查询，实施人为该员工的所有任务
     * @param username
     * @return
     */
    @ResponseBody
    @RequestMapping("/findPlanByUsername")
    public List<Task> findPlanByUsername(@RequestParam("username") String username) {
        return ps.findPlanByUsername(username);
    }


    @ResponseBody
    @RequestMapping("/findPlanById")
    public Plan findPlanById(@RequestParam("id") Integer id) {
        return ps.findPlanById(id);
    }

    @RequestMapping("/editPlan")
    public void editPlan(@RequestBody Plan plan){
        ps.editPlan(plan);
    }

    @RequestMapping("/addPlan")
    public void addPlan(@RequestBody Plan plan){
        ps.addPlan(plan);
    }


    @RequestMapping("/delPlan")
    public void delPlan(@RequestParam("id") Integer id){
        ps.delPlan(id);
    }


    @ResponseBody
    @RequestMapping("/findPlanSubsume")
    public List<Plan> findPlanSubsume(@RequestBody Plan plan){
       return ps.findPlanSubsume(plan);
    }
}

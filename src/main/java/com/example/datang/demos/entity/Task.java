package com.example.datang.demos.entity;

import lombok.Data;

@Data
public class Task {
    public Integer id;
    public String taskName;
    public String taskDesp;
    public String bTime;
    public String eTime;
    public String realBTime;
    public String realETime;
    public String belongStaff;
    public String belongZhuguan;
    public String taskCondition;

    //user表中的username，用来对应：任务属于哪个员工
    //public String username;
}

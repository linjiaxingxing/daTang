package com.example.datang.demos.entity;

import lombok.Data;

@Data
public class Plan {
        public Integer id;
        public String planName;
        public String planDesp;
        public String bTime;
        public String eTime;
        public String belongTask;
        public String planCondition;
        public String feedback;
        public String returnInfo;

        //task表中的taskName，用来对应：计划属于哪个任务
        //public String taskName;

}

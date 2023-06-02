package com.example.datang.demos.service.impl;

import com.example.datang.demos.entity.Admin;
import com.example.datang.demos.mapper.AdminMapper;
import com.example.datang.demos.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public String adminLogin(String inputAName, String inputPsd) {
        Admin admin = adminMapper.findAdminByName(inputAName);
        if (admin == null){
            return "-1";
        }else if (!(admin.adminPsd.equals(inputPsd))){
            return "0";
        }else {
            //管理员登录
            return "9";
        }
    }
}

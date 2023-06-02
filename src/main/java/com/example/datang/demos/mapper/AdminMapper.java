package com.example.datang.demos.mapper;

import com.example.datang.demos.entity.Admin;

public interface AdminMapper {
    /**
     * 登陆验证，从数据库查询是否存在
     * @param adminName 页面输入的值
     * @return 查询到的admin对象
     */
    public Admin findAdminByName(String adminName);
}

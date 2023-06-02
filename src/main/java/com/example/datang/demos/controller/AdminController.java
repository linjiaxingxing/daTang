package com.example.datang.demos.controller;

import com.example.datang.demos.entity.User;
import com.example.datang.demos.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService as;

    /**
     * 管理员登录功能的实现
     *  @param user 前台传过来用户名，密码
     * @return 返回的是错误码，在ajax中判断是否成功
     */
    @ResponseBody
    @RequestMapping("/login")
    public String userLogin(@RequestBody User user) {
        System.out.println();
        return as.adminLogin(user.username,user.password);
    }
}

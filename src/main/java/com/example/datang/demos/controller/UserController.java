package com.example.datang.demos.controller;

import com.example.datang.demos.entity.User;
import com.example.datang.demos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService us;

    /**
     * 非管理员登录
     *
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping("/login")
    public String userLogin(@RequestBody User user) {
        return us.userLogin(user.username, user.password);
    }

    /**
     * 根据主管姓名，查询下属员工信息
     *
     * @param username
     * @return
     */
    @ResponseBody
    @RequestMapping("/findByBossName")
    public List<User> findByBossName(@RequestParam("username") String username) {
        return us.findByBossName(username);
    }

    /**
     * 根据主管username查询主管id，编辑或添加下属员工时，数据库插入的是id，前台显示的是名字
     *
     * @param username
     * @return
     */
    @ResponseBody
    @RequestMapping("/findByName")
    public User findByName(@RequestParam("username") String username) {
        return us.findByName(username);
    }


    /**
     * 查询所有用户，管理员功能
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/findAllUser")
    public List<User> findAllUser() {
        return us.findAllUser();
    }

    /**
     * 编辑用户信息
     *
     * @param user
     */
    @RequestMapping("/edit")
    public void editUser(@RequestBody User user) {
        us.editUser(user);
    }


    /**
     * 删除用户信息
     *
     * @param id
     */
    @RequestMapping("/del")
    public void editUser(@RequestParam("id") Integer id) {
        us.delUser(id);
    }


    /**
     * 新添加用户
     *
     * @param user
     */
    @RequestMapping("/add")
    public void addUser(@RequestBody User user) {
        us.addUser(user);
    }

}

package com.example.datang.demos.mapper;

import com.example.datang.demos.entity.User;

import java.util.List;

public interface UserMapper {
    /**
     * 登陆验证，从数据库查询是否存在
     * @param username 页面输入的值
     * @return 查询到的user对象
     */
    public User findByName(String username);

    /**
     * 根据主管姓名，查询下属员工信息
     * @param username
     * @return
     */
    public List<User> findByBossName(String username);

    /**
     * 查询所有用户，管理员功能
     * @return
     */
    public List<User> findAllUser();

    public void editUser(User user);

    public void delUserById(Integer id);

    public void addUser(User user);
}

package com.example.datang.demos.service;

import com.example.datang.demos.entity.User;

import java.util.List;

public interface UserService {
    public String userLogin(String inputUName, String inputPsd);

    public List<User> findAllUser();

    public List<User> findByBossName(String username);

    public User findByName(String username);

    public void editUser(User user);

    public void delUser(Integer id);

    public void addUser(User user);
}

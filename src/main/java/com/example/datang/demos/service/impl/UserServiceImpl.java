package com.example.datang.demos.service.impl;

import com.example.datang.demos.entity.User;
import com.example.datang.demos.mapper.UserMapper;
import com.example.datang.demos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    /**
     * 非管理员登录
     * @param inputUName
     * @param inputPsd
     * @return
     */
    @Override
    public String userLogin(String inputUName, String inputPsd) {
        User user = userMapper.findByName(inputUName);
        if (user == null){
           return "-1";
        }else if (!(user.password.equals(inputPsd))){
            return "0";
        }else if(user.belong!=null){
            //员工登录
            return "1";
        }else {
            //主管登录
            return "2";
        }
    }

    /**
     * 查询所有用户，管理员功能
     * @return
     */
    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();

    }

    /**
     * 根据主管姓名，查询下属员工信息
     * @param username
     * @return
     */
    @Override
    public List<User> findByBossName(String username) {
        return userMapper.findByBossName(username);
    }

    /**
     * 根据主管username查询主管id，编辑或添加下属员工时，数据库插入的是id，前台显示的是名字
     * @param username
     * @return
     */
    @Override
    public User findByName(String username) {
        return userMapper.findByName(username);
    }

    @Override
    public void editUser(User user) {
        userMapper.editUser(user);
    }

    @Override
    public void delUser(Integer id) {
        userMapper.delUserById(id);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}

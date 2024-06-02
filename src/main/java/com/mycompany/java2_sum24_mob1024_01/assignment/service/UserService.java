package com.mycompany.java2_sum24_mob1024_01.assignment.service;

import com.mycompany.java2_sum24_mob1024_01.assignment.dao.UserDao;
import com.mycompany.java2_sum24_mob1024_01.assignment.entity.User;
import java.util.List;

public class UserService {

    private UserDao userDao;

    public UserService() {
        userDao = new UserDao();
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

}
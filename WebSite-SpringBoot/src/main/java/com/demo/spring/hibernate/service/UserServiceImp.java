package com.demo.spring.hibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.userService;
import com.demo.bean.User;

@Service
@Transactional
public class UserServiceImp implements userService {
    @Autowired
    UserDao userDao;


    public List<com.demo.bean.User> getUser() {
        // TODO Auto-generated method stub
        return userDao.getUser();
    }

    public User findById(int id) {
        // TODO Auto-generated method stub
        return userDao.findById(id);
    }

    public void createUser(User user) {
        
        userDao.addUser(user);
    }

    public void deleteUserById(int id) {
        // TODO Auto-generated method stub
        userDao.delete(id);
    }
    @Override
    public User updatePartially(User user, int id) {
        userDao.updateCountry(user,id);
        return userDao.findById(id);
    }

    @Override
    public User update(User user,int id) {
        
        return userDao.update(user, id);
    }

}
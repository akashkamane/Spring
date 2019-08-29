package com.demo;

import java.util.List;

import com.demo.bean.User;

public interface userService {
	public void createUser(User user);
    public List<User> getUser();
    public User findById(int id);
    public User update(User user, int id);
    public void deleteUserById(int id);
    public User updatePartially(User user, int id);

}
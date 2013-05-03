package com.awesomeis.project.dao;

import java.util.List;

import com.awesomeis.project.model.User;

public interface IUserDAO {

    public void addUser(User user);
    public List<User> listUsers();
    public void removeUser(Integer id);
}

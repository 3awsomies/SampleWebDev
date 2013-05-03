package com.awesomeis.project.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.awesomeis.project.dao.IUserDAO;
import com.awesomeis.project.model.User;

@Service
public class UserManager {

    @Autowired
    private IUserDAO userDAO;
    
    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }
    
    @Transactional
    public List<User> listUsers(){
        return userDAO.listUsers();
    }
    
    @Transactional
    public void removeUser(Integer id) {
        userDAO.removeUser(id);
    }
}

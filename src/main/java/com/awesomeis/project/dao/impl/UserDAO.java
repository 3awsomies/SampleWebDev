package com.awesomeis.project.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.awesomeis.project.dao.IUserDAO;
import com.awesomeis.project.model.User;

@Repository
public class UserDAO implements IUserDAO{
    
    private static final Log LOGGER = LogFactory.getLog(UserDAO.class);
    @Autowired
    private SessionFactory sessionFactory;
    
    public void addUser(User user){
        sessionFactory.getCurrentSession().save(user);
    }
    
    public List<User> listUsers(){
        return sessionFactory.getCurrentSession().createQuery("from User").list();
    }

    public void removeUser(Integer id) {
        User user = (User) sessionFactory.getCurrentSession().load(User.class, id);
        if(null != user){
            sessionFactory.getCurrentSession().delete(user);
        }
    }

}

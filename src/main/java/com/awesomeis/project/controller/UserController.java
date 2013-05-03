package com.awesomeis.project.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.awesomeis.project.manager.UserManager;
import com.awesomeis.project.model.User;

@Controller
public class UserController {

    @Autowired
    private UserManager userManager;
    
    @RequestMapping("/user")
    public String listUsers(Map<String, Object> map){
        map.put("user", new User());
        map.put("userList", userManager.listUsers());
        
        return "user";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("user")
    User user, BindingResult result) {
 
        userManager.addUser(user);
 
        return "redirect:/user";
    }
 
    @RequestMapping("/delete/{userId}")
    public String deleteContact(@PathVariable("userId")
    Integer userId) {
 
        userManager.removeUser(userId);
 
        return "redirect:/user";
    }
    
}

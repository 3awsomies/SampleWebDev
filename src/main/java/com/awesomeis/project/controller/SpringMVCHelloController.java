package com.awesomeis.project.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMVCHelloController {
    private static final Log LOGGER = LogFactory.getLog(SpringMVCHelloController.class);
    @RequestMapping("/")
    public String printHelloWorld(Model model) {
        LOGGER.error("log this");
        model.addAttribute("message", "Hello World!");
 
        return "helloWorld";
    }
}

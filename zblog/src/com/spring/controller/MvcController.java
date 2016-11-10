package com.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.MySelf;
import com.spring.server.MySelfService;


@Controller
@RequestMapping("/mvc")
public class MvcController {
 
	MySelfService mySelfServer = new MySelfService();
	
    @RequestMapping("/hello")
    public ModelAndView hello(){ 
    	 ModelAndView model = new ModelAndView("my");
    	 MySelf mySelf = mySelfServer.getMySelf();
    	 model.addObject("mySelf", mySelf);
    	 return model;
    }
    
}
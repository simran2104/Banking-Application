package com.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.banking.entity.User;
import com.banking.service.UserServiceImpl;


@Controller
public class ProcessController {
	
	@Autowired
	private UserServiceImpl servObj;
	
	@RequestMapping(value="/registerForm", method=RequestMethod.GET)
	public String getregisterForm(Model model){
		
		User user = new User();
		
		model.addAttribute(user);
		return "registrationpage";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView getregister(@ModelAttribute("user") User user){
		
		ModelAndView mv = new ModelAndView();
		int pid = servObj.createUser(user);
		
		mv.addObject("successmsg", "Registeration done. Welcome to your Dashboard");
		mv.setViewName("dashboard");
		return mv;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getlogin(){
		
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView loginAuthenticator(@ModelAttribute User user)
	{
		ModelAndView mv = new ModelAndView();;
		boolean status = servObj.searchUser(user);
		
		if(status){
			mv.addObject("successmsg", "Authentication done. Welcome to your Dashboard");
			mv.setViewName("dashboard");
			return mv;
	
		}
		
		mv.addObject("errormsg", "Authentication Failed!");
		mv.setViewName("error");
		
		return mv;
	}

}

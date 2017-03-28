package com.kylin.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicInterface2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kylin.model.User;
import com.kylin.service.UserService;

@Controller  
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/show")
	public String show(HttpServletRequest request,Model model) {
		System.out.println("here");
		User user = userService.getUserById(1);
		model.addAttribute("user", user);
		return "test";
	}
	
	@RequestMapping("/show2")
	public ModelAndView show2(HttpServletRequest request,
			HttpServletResponse response) {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession(true);
		ModelAndView mv = new ModelAndView();
		User user = userService.getUserById(1);
		mv.addObject("user",user);
		mv.setViewName("test");
		System.out.println("8888");
		return mv;
	}
}
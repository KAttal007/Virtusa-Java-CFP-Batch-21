package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Login;
import com.example.service.LoginService;

@Controller
public class PrintUserController {

	@RequestMapping("print")
	public String print(HttpServletRequest request,ModelMap m) {
		
		LoginService ls=new LoginService();
		Login lo=ls.printUser(request);
//		request.setAttribute("display", lo);
	
		m.addAttribute("fn",lo.getFname());
		m.addAttribute("ln",lo.getLname());
		m.addAttribute("gen",lo.getGender());
		
		
		return "print.jsp";
		
	}
}

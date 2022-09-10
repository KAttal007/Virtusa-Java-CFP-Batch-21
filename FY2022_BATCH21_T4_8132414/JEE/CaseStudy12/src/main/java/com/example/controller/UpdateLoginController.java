package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Login;
import com.example.service.LoginService;

@Controller
public class UpdateLoginController {
	
	@RequestMapping("update")
	public String update(HttpServletRequest request) {
		String fn=request.getParameter("fn");
		String ln=request.getParameter("ln");
		String gen=request.getParameter("gen");
		Login lo=new Login();
		lo.setFname(fn);
		lo.setLname(ln);
		lo.setGender(gen);
		LoginService ls=new LoginService();
		boolean res=ls.updateLogin(lo,request);
		if(res==true) {
			request.setAttribute("b","1");
			return "index.jsp";
		}
		return "failure.jsp";
	}
}

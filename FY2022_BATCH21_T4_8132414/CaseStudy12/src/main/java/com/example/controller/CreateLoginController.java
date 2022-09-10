package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Login;
import com.example.service.LoginService;

@Controller
public class CreateLoginController {
	@RequestMapping("signup")
	public String signUp(HttpServletRequest request,HttpServletResponse response) {
		String fn=request.getParameter("fn");
		String ln=request.getParameter("ln");
		String gen=request.getParameter("gen");
		
		String loginId=request.getParameter("lid");
		String loginpwd=request.getParameter("pwd");
		Login lo=new Login();
		
		lo.setFname(fn);
		lo.setLname(ln);
		lo.setGender(gen);
		
		lo.setLoginId(loginId);
		lo.setLoginPwd(loginpwd);
		
		LoginService ls=new LoginService();
		boolean res=ls.createLogin(lo);	
		if(res==true) {
			request.setAttribute("a","1");
			return "index.jsp";
		}
		return "failure.jsp";
	}
}

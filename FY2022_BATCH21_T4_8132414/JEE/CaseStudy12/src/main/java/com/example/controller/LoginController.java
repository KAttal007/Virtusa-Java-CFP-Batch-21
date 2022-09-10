package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Login;
import com.example.service.LoginService;

@Controller
public class LoginController {
	@RequestMapping("login")
	public String login(HttpServletRequest request) {
		String lid=request.getParameter("lid");
		String pwd=request.getParameter("pwd");
		Login lo=new Login();
		lo.setLoginId(lid);
		lo.setLoginPwd(pwd);
		HttpSession hs=request.getSession();
		hs.setAttribute("user",lo);
		LoginService ls=new LoginService();
		boolean res=ls.login(lo);
		if(res==true) {
			return "home.jsp";
		}
		return "failure.jsp";
	}
}
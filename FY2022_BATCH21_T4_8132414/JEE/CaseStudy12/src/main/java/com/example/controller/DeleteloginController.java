package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Login;
import com.example.service.LoginService;

@Controller
public class DeleteloginController {
	
	@RequestMapping("delete")
	public String delete(HttpServletRequest request) {
		HttpSession hs=request.getSession();
		Login l=(Login) hs.getAttribute("user");
		Login lo=new Login();
		lo.setLoginId(l.getLoginId());
		lo.setLoginPwd(l.getLoginPwd());
		LoginService ls=new LoginService();
		boolean res=ls.deleteLogin(lo);
		if(res==true) {
			request.setAttribute("c","1");
			return "index.jsp";
		}
		return "failure.jsp";
	}
}

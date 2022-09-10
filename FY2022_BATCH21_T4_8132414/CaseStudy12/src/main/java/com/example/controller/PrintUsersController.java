package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Login;
import com.example.service.LoginService;

@Controller
public class PrintUsersController {
	@RequestMapping("printusers")
	public String printUsers(HttpServletRequest request) {
		LoginService ls=new LoginService();
		List<Login> uList=ls.printUsers();
		request.setAttribute("usersList", uList);
		return "printusers.jsp";
	}
}